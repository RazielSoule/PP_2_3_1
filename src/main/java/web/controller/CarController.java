package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) Integer quantity, ModelMap model) {

        model.addAttribute("carsList", carService.getCars(quantity));

        return "cars";
    }

}
