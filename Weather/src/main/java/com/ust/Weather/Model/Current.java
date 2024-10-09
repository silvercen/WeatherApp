package com.ust.Weather.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Current {
    private double temp_c;
    private double humidity;
    private double feelslike_c;
}
