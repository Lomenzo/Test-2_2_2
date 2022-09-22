package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

//1. �������� ��� ���� ����������, ������������ �� /cars.
@Controller
public class CarController {
    final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/")
    public String postCars(ModelMap model) {
        //3. �������� ������ �� 5 �����.
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porsche", 911, "Red"));
        cars.add(new Car("Porsche", 914, "White"));
        cars.add(new Car("ToyotaMark", 2, "Black"));
        cars.add(new Car("Peugeot", 206, "Blue"));
        cars.add(new Car("MitsubishiLancer", 8, "Yellow"));

        //4. �������� ������ � �������, ������� ����� ���������� ��������� ����� ����� �� ���������� ������.
        List<Car> newCarList = carService.getList(2,cars);

        List<String> messages = new ArrayList<>();
        for (Car car : newCarList) {
            messages.add(car.getManufacturer() + " " + car.getSeries() + "  " + car.getColor());
        }

        model.addAttribute("messages", messages);
        return "index";
    }
}
