package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarsDaoImpl implements CarsDao {
    // �������������� ����
    private final List<Car> cars;

    // ��������� ������
    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Moskvich", "brown"));
        cars.add(new Car(2, "Lada", "blue"));
        cars.add(new Car(3, "BMW", "red"));
        cars.add(new Car(4, "Toyota", "orange"));
        cars.add(new Car(5, "Volvo", "green"));
    }

    /* ������ �������� ���������� ����� �� ��������� � getCars �� ����������� */
    @Override
    public List<Car> getCarsDao(int number) {
        // ������� �����,  ������������ �� ��������� � ���������� ������
        return cars.stream().limit(number).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsDao() {
        return cars;
    }

}

