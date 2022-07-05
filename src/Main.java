import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        CarPark carPark = new CarPark(50, 20);
        Scanner scanner = new Scanner(System.in);
        System.out.println(carPark.printCarParkDetails());


        boolean isActive = true;

        while (isActive) {
            System.out.println("Welcome to the Car Park!\n Please select what type of vehicle you would like to park:");
            System.out.println("1. Car\n2. Motorcycle\n3. Van\n4. See car park overview");
            int userInput = scanner.nextInt();
            if (userInput==1) {
                Car car = new Car();
                car.park(carPark);
                isActive = carPark.printGoodbye(scanner);

            } else if (userInput == 2) {
                MotorCycle motorcycle = new MotorCycle();
                motorcycle.park(carPark);
                isActive = carPark.printGoodbye(scanner);

            }else if (userInput == 3) {
                Van van = new Van();
                van.park(carPark);
                isActive = carPark.printGoodbye(scanner);

            } else if (userInput == 4) {
                System.out.println(carPark.printCarParkDetails());

            } else{
                System.out.println("Goodbye!");
                isActive= false;
            }

        }
    }
}