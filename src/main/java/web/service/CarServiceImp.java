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
        cars.add(new Car(1,"Москвич", "Желтый"));
        cars.add(new Car(2,"Вольво", "Зеленый"));
        cars.add(new Car(3,"Ауди", "Синий"));
        cars.add(new Car(4,"Рено", "Белый"));
        cars.add(new Car(5,"Тойота", "Серая"));
        return cars;
    }

}
