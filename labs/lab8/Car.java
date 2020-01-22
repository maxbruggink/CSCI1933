public class Car extends Vehicle {
public double milesPerGallon;
public static void main(String[] args) {
        Car car1= new Car(30);
        Car car2= new Car(25);
        System.out.println(car1.getMPG());
        car1.movingForward();
        System.out.println(getNumVehicles());
}
public Car(double mpg){
        this.milesPerGallon=mpg;
        nVehicles++;
}
public double getMPG(){

        return milesPerGallon;
}

public void movingForward(){
        System.out.println("Car is moving forwards");
}
public void movingBackward(){
        System.out.println("Car is moving backwards");
}

}
