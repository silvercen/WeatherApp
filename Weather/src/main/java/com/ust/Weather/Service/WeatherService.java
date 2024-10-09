package com.ust.Weather.Service;

import com.ust.Weather.Model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    private final WebClient webClient;

    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://api.weatherapi.com/v1").build();
    }

    public Mono<WeatherResponse> getWeather(String location) {
        return webClient.get()
                .uri("/current.json?key={apiKey}&q={location}", "ef00427e92fe4dbd9f232722240910", location)
                .retrieve()
                .bodyToMono(WeatherResponse.class);
    }
}
