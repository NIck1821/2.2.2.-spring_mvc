package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;

import java.util.List;
import java.util.Locale;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, Locale locale) {
        List<Car> carModel = new CarService().carList();
        model.addAttribute("CarsModel", carModel);
        return "cars";
    }
}
