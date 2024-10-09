package com.ust.Weather.Controller;

import com.ust.Weather.Model.WeatherResponse;
import com.ust.Weather.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{location}")
    public Mono<WeatherResponse> getWeather(@PathVariable String location) {
        return weatherService.getWeather(location);
    }
}
