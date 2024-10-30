package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String modelName;
    private String color;
    private int carNumber;

    private static List<Car> carsListPH = new ArrayList<>();
    static {
        carsListPH.add(new Car("model1", "red", 1));
        carsListPH.add(new Car("model2", "green", 2));
        carsListPH.add(new Car("model3", "blue", 3));
        carsListPH.add(new Car("model4", "yellow", 4));
        carsListPH.add(new Car("model5", "black", 5));
    }

    public static List<Car> getCarsListPH(Integer quantity) {
        if (quantity != null && quantity < 5 && quantity >= 0) {
            return carsListPH.stream().limit(quantity).toList();
        }
        return carsListPH;
    }

    public Car(String modelName, String color, int carNumber) {
        this.modelName = modelName;
        this.color = color;
        this.carNumber = carNumber;
    }

    public Car() {

    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
}
