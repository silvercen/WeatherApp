package com.ust.Weather.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
}
