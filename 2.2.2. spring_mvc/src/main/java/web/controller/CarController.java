package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/car")
    public String printWelcome(ModelMap model) {
        Car car = new Car(34, "name", "Nick");
        List<String> messages = new ArrayList<>();
        messages.add(car.getName());
        messages.add(car.getId().toString());
        messages.add(car.getOwner());
        model.addAttribute("messages", messages);
        return "cars";
    }
}
