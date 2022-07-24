package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/cars")
    public String printCar(@RequestParam(value = "count" , required = true, defaultValue = "5")Integer id, Model model) {
        List cars1 = new ArrayList();
        if(id >= 5) {
            model.addAttribute("carslist", carService.getCars());
        }else {
            for (int x = 1, y = 0; x <= id; x++, y++) {
                cars1.add(carService.getCars().get(y));
            }
            model.addAttribute("carslist", cars1);
        }
        return "cars";

    }
}