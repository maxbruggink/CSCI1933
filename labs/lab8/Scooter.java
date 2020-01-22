public class Scooter implements Drivable{
  public static void main(String[] args) {
    Scooter scooter1 = new Scooter();
    scooter1.movingBackward();
  }
  public Scooter(){}
    public void movingForward(){
  System.out.println("Scooter is moving forward");
    }
    public void movingBackward(){
  System.out.println("Scooter is moving backwards");
    }
  }
