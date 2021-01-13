package main;

import car.Car;
import car.CarController;
import storage.IOfile;

import java.util.ArrayList;
import java.util.Scanner;

public class Index {
    private static final String CARFILE = "car.dat";
    private static ArrayList<Car> carList;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        carList = new ArrayList<>();
        carList = IOfile.readFile(CARFILE);
        CarController carController = new CarController(carList);
        menu(scanner,carController);
    }
    public static void menu (Scanner scanner, CarController carController) {
        System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ ----");
        System.out.println("Chọn chức năng theo số :");
        System.out.println("1 . Xem danh sách xe trong kho ");
        System.out.println("2 . Thêm mới xe");
        System.out.println("3 . Cập nhật xe");
        System.out.println("4 . Xóa");
        System.out.println("5 . Tìm kiếm");
        System.out.println("6 . Lên đơn hàng");
        System.out.println("7 . Danh sách đơn hàng");
        System.out.println("8 . Đọc từ File");
        System.out.println("9 . Ghi vào File");
        System.out.println("0 . Thoát");
        System.out.println("Chọn chức năng :");

        int key = scanner.nextInt();

        switch (key) {
            case 0 :
                System.out.println("GOODBYE!!!");
                System.exit(0);
                break;
            case 1 :
                carController.displayCar();
                menu(scanner,carController);
                break;
            case 2 :
                carController.inputCar(scanner);
                menu(scanner,carController);
                break;
            case 3 :
                IOfile.writeFile(CARFILE, carList);
                break;
            case 4:
                carList = IOfile.readFile(CARFILE);
                menu(scanner,carController);
                break;

        }
    }
}
