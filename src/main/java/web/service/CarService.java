package web.service;

import web.Model.Car;

import java.util.List;

public interface CarService {
    public List<Car> showAllCar();

    public List<Car> showCar(int count);
}
