package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    public List<Car> getList(int carsQuantity, List<Car> list){
        List<Car> processedCarList = new ArrayList<>();
        for (int x = 0; x < carsQuantity; x++) {
            processedCarList.add(list.get(x));
        }
        return processedCarList;
    }

}
