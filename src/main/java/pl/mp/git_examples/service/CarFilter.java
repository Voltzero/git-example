package pl.mp.git_examples.service;

import pl.mp.git_examples.car.model.Car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarFilter {

    static public List<Car> findCarOfColor(List<Car> cars, String color) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                result.add(car);
            }
        }
        return result;
    }

    static public List<Car> findCarOfColorJava8(List<Car> cars, String color) {

        return cars.stream()
                .filter(car -> car.getColor().equals(color))
                .collect(Collectors.toList());
        //return Collections.emptyList();
    }

    static public List<Car> getCarsWithGIvenEngineAndPriceLessThan(List<Car> cars, BigDecimal maxPrice, int minimalEngine) {

        return cars.stream()
                .filter(car -> car.getPrice().compareTo(maxPrice) < 0 && car.getEngine() <= minimalEngine)
                .collect(Collectors.toList());
    }

    static public List<Car> filterCars(List<Car> cars, Predicate<Car> myFilter) {

        return cars.stream()
                .filter(myFilter)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterCars(CarProvider.getMyCars(), car -> car.getBrand().equals("Renault"))
                .forEach(car -> System.out.println(car));
    }
}
