package com.ghibli.ghibliapi.client;

import com.ghibli.ghibliapi.config.dto.TextToImageRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        name = "stabilityAiClient",
        url = "${stability.api.base-url}", // url from application.properties file
        configuration = com.ghibli.ghibliapi.config.FeignConfig.class
)
public interface StabilityAIClient {

    @PostMapping(
            value = "/v1/generation/{engine_id}/text-to-image",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            headers = {"Accept = image/png"}
    )
    byte[] generateImageFromText(
            @RequestHeader("Authorization") String authorizationHeader,
            @PathVariable ("engine_id") String engineId,
            @RequestBody TextToImageRequest requestBody
    );

}
