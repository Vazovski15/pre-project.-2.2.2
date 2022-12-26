package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller

public class CarController {

    private  CarService carService;

    @Autowired
    public CarController(CarService carService) {

        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carService.showCar(count));
        return "cars";


    }

        }