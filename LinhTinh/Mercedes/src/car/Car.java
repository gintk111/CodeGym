package car;

import java.io.Serializable;

public class Car implements Serializable {
    private int carID = 0;
    private String carName;
    private int quantity;
    private double price;

    public Car(int carID, String carName, int quantity, double price) {
        this.carID = carID;
        this.carName = carName;
        this.quantity = quantity;
        this.price = price;
    }

    public Car() {
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID() {
        this.carID++;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", carName='" + carName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

