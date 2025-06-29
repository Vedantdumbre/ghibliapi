package com.ghibli.ghibliapi.service;
import com.ghibli.ghibliapi.client.StabilityAIClient;
import lombok.Value;
import org.springframework.stereotype.Service;

@Service
public class GhibliArtService {

    private final StabilityAIClient stabilityAIClient;
    private final String apikey;

    public GhibliArtService(StabilityAIClient stabilityAIClient, @Value("${stability.api.key}") String apikey) {
        this.stabilityAIClient = stabilityAIClient;
        this.apikey = apikey;
    }
}
