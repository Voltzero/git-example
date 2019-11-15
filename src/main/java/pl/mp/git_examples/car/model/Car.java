package pl.mp.git_examples.car.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Car {
    //poczytać o hashcodach kontraktach
    private String brand;
    private String model;
    private String color;
    private BigDecimal price;
    private int engine;
}
