package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    public List<Car> carList (){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(34, "A", "Max"));
        cars.add(new Car(35, "B", "Egor"));
        cars.add(new Car(36, "C", "Lena"));
        return cars;
    }
}
