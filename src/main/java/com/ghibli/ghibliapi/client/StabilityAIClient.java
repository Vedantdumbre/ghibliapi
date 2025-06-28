package com.ghibli.ghibliapi.client;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "stabilityAIClient",
        url = "${stability.api.base-url}",
        configuration = com.ghibli.ghibliapi.config.FeignConfig.class
)
public class StabilityAIClient {

}
