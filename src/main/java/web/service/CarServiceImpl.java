package web.service;


import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW","X5",2017));
        carList.add(new Car("LEXUS","LS500",2010));
        carList.add(new Car("AUDI","Q5",2021));
        carList.add(new Car("AUDI","A4",2022));
        carList.add(new Car("KIA","RIO",2015));

    }

    public List<Car> showAllCar(){

        return carList;
    }

    public List<Car> showCar(int count){
        return carList.stream().limit(count).collect(Collectors.toList());
    }




}
