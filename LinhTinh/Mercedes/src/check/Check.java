package check;

import car.Car;

import java.util.ArrayList;

public class Check {
    public boolean checkname(ArrayList<Car> arrayList, String name) {
        for (Car car : arrayList) {
            if (car.getCarName().equals(name)) {
                return false;
            }
        }
        return true;
    }
}
