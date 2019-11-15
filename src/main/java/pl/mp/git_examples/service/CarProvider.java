package pl.mp.git_examples.service;

import pl.mp.git_examples.car.model.Car;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CarProvider {

    public static List<Car> getMyCars() {

        return Arrays.asList(
                new Car("Renault", "Megane", "Gray", new BigDecimal(7_500L), 1500),
        new Car("Opel", "Astra", "Gray", new BigDecimal(17_500L), 1600),
        new Car("Bugatti", "Chiron", "Black", new BigDecimal(21_500_000L), 8500),
        new Car("Fiat", "Panda", "Blue", new BigDecimal(7_500L), 1500),
        new Car("Renault", "Magnum", "White", new BigDecimal(177_500L), 4500)
        );
    }
}
