package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

//1. Создайте еще один контроллер, замаппленный на /cars.
@Controller
public class CarController {
    @GetMapping(value = "/")
    public String postCars(ModelMap model) {
        //3. Создайте список из 5 машин.
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porsche", 911, "Red"));
        cars.add(new Car("Porsche", 914, "White"));
        cars.add(new Car("ToyotaMark", 2, "Black"));
        cars.add(new Car("Peugeot", 206, "Blue"));
        cars.add(new Car("MitsubishiLancer", 8, "Yellow"));

        List<Car> processedCarList = new ArrayList<>();
        for (int x = 0; x < 3; x++) {
            processedCarList.add(cars.get(x));
        }

        //4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
        List<String> messages = new ArrayList<>();
        for (Car car : processedCarList) {
            messages.add(car.getManufacturer() + " " + car.getSeries() + "  " + car.getColor());
        }

        model.addAttribute("messages", messages);
        return "index";
    }
}
