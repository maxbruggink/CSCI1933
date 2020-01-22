/**
 * A class representing a Ferry, which transports Passengers from island to island.
 * Can hold up to 60 Passengers at a time.
 */

public class Ferry {

private Passenger[] ferry= new Passenger[60];
private int Shipcount =0;
    // TODO: implement this
    public boolean addPassenger(Passenger p) {
      if(Shipcount==60){return false;}
      if(p instanceof Passenger==false){
        return false;
      }
      else{
        ferry[Shipcount]=p;
        Shipcount+=1;
        return true;
      }
     }

    // TODO: implement this
    public Passenger[] removePassengersAtIsland(int island){
      Passenger[] removeHere= new Passenger[60];
      int removeHereCount = 0;
      for(int i =0; i<Shipcount;i++){
        if(ferry[i].getDropoffIsland()==island){
          removeHere[removeHereCount]= ferry[i];
          ferry[i]=null;
          removeHereCount+=1;
        }

      }
      return removeHere;
       }

    // TODO: implement this
    public boolean isFull() {
      if(Shipcount==60){
      return true;
    }
    return false;

  }

}
