/**
 * A class that handles the addition of Passengers to the line on an island
 */
 import java.util.Random;
public class PassengerArrivalEvent implements IEvent{
    private int island;
    public static int lineCount=0;
    public PassengerArrivalEvent(int island){
        this.island = island;
    }
    public int getIsland(){
        return island;
    }

    // TODO: implement this method
    @Override
    public void run() {
      Random r = new Random();
      int low= 5;
      int high = 15;
      int result= r.nextInt(high-low)+low;
      Passenger newPassenger = new Passenger(island);
      FerrySim.lines[island].add(newPassenger);
      FerrySim.agenda.add(new PassengerArrivalEvent(island),result);
      //FerrySim.agenda.add(newPassenger,result);
      System.out.println("Passenger Event Island:"+island+", Current Time is: "+ FerrySim.agenda.getCurrentTime()+" Next Passenger in: "+ result);
      lineCount+=1;
    }
}
