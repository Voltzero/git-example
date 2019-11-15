package pl.mp.git_examples.service;

import pl.mp.git_examples.car.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarFilter {

    public List<Car> findCarOfColor(List<Car> cars, String color) {
        List<Car> result = new ArrayList<>();
        for (Car car:cars) {
            if (car.getColor().equals(color)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findCarOfColorJava8(List<Car> cars, String color) {

        return cars.stream()
                .filter(car -> car.getColor().equals(color))
                .collect(Collectors.toList());
        //return Collections.emptyList();
    }
}
