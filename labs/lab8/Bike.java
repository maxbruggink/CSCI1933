public class Bike implements Drivable{
  public static void main(String[] args) {
Bike bike1 = new Bike();
bike1.movingForward();
  }
  public Bike(){

  }
  public void movingForward(){
System.out.println("Bike is moving forward");
  }
  public void movingBackward(){
System.out.println("Bike is moving backwards");
  }
}
