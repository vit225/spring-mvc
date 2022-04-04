package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private final List<Car> cars = new ArrayList<>();

    public CarDao() {
        cars.add(new Car("Toyota", 2010, "white"));
        cars.add(new Car("Nissan", 2020, "black"));
        cars.add(new Car("Mazda", 2011, "yellow"));
        cars.add(new Car("Mitsubishi", 2000, "gray"));
        cars.add(new Car("Bmw", 2002, "blue"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getNumberOfCar(String number) {
        if (Integer.parseInt(number) >= 5) {
            return cars;
        }
        List<Car> car = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(number); i++) {
            car.add(cars.get(i));
        }
        return car;
    }
}
