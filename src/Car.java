public class Car extends Vehicle{    public Car() {        super(4, "car");    }    @Override    public void park(CarPark carpark) {        if(carpark.hasCarParksAvailable()){            carpark.setAvailableRegularParks(carpark.getAvailableRegularParks()-1);            System.out.println("You have successfully parked your car!");        } else {            System.out.println("There are not enough spaces for you to park! Please try elsewhere!");        }        System.out.println(carpark.printCarParkDetails());    }    @Override    public void printVehicleDetails() {    }}