import model.Bicycle;
import model.Car;
import model.Truck;
import service.ServiceStation;



public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1");
        Car car2 = new Car("car2");


        Truck truck = new Truck("\n\ntruck1", 6);
        Truck truck2 = new Truck("\n\ntruck2", 8);


        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);





        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);


    }
}