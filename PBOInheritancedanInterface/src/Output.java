
public class Output {
    public static void main(String[] args) {
        Car car = new Car(5);
RaceCar fastCar = new RaceCar(5);
car.display();
car.addFuel();
car.display();
fastCar.display();
fastCar.addFuel();
fastCar.display();
    }
}
