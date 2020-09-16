package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "locale", required = false) String param,
                               ModelMap model) {
        List<Car> carModel = new CarService().carList();
        if (param.contains( "ru")){
            param = "Машины";
        } else {
            param = "Cars";
        }
        model.addAttribute("CarsModel", carModel);
        model.addAttribute("Param", param);
        return "cars";
    }
}
