package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService{

    @Override
    public List<Car> getCars() {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1,"�������", "������"));
        cars.add(new Car(2,"������", "�������"));
        cars.add(new Car(3,"����", "�����"));
        cars.add(new Car(4,"����", "�����"));
        cars.add(new Car(5,"������", "�����"));
        return cars;
    }

}
