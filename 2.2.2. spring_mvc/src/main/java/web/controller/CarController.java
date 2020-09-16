package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Model.Car;
import web.Service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
   //     Car car = new Car(34, "A", "Max");
        List<Car> carModel = new CarService().carList();
        model.addAttribute("CarsModel", carModel);
        return "cars";
    }
}
