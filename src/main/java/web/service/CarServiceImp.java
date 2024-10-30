package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCars(Integer quantity) {
        return Car.getCarsListPH(quantity);
    }
}
