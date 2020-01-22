public class Drone extends Vehicle {
  public double milesPerGallon;
public static void main(String[] args) {
Drone drone1 = new Drone(5);
System.out.println(drone1.getMPG());
drone1.movingBackward();
System.out.println(getNumVehicles());
}
public Drone(double mpg){
  this.milesPerGallon=mpg;
  nVehicles++;
}
public double getMPG(){
  return milesPerGallon;
}
public void movingForward(){
  System.out.println("Drone is moving forwards");
}
public void movingBackward(){
  System.out.println("Drone is moving backwards");
}
}
