package car;

import check.Check;

import java.util.ArrayList;
import java.util.Scanner;

public class CarController {
    ArrayList<Car> carArrayList ;
    Check check = new Check();
    public CarController(ArrayList<Car> carArrayList) {
        this.carArrayList = carArrayList;
    }

    public void displayCar() {
        System.out.printf("%s%20s%20s%20s%n","ID","Name","Quantity","Price");
        for (Car car : carArrayList) {
            System.out.printf("%d%20s%17d%25f%n",car.getCarID(),car.getCarName(),car.getQuantity(),car.getPrice());
        }
    }
    public void inputCar(Scanner scanner) {
        int id = 0;
        if (carArrayList.size() == 0){
            id = 1;
        }else {
             id = carArrayList.get(carArrayList.size() - 1).getCarID() + 1;
        }
        System.out.println("Vui lòng nhập tên: ");
        String name = new Scanner(System.in).nextLine();
        if (!check.checkname(carArrayList,name)){
            System.out.println("Tên sản phẩm đã tồn tại.Vui lòng nhập lại");
            return;
        }
        System.out.println("Vui lòng nhập số lượng");
        int quantity = scanner.nextInt();;
        System.out.println("Vui lòng nhập giá xe");
        double price = scanner.nextDouble();
        carArrayList.add(new Car(id,name,quantity,price));

    }

}
