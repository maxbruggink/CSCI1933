public class Bus {
    private int capacity;
    private int currentTime;
    private boolean isExpress;
    public Rider[] bus= new Rider[50];
    public int passengerCount;
    public int stop;
    private int[] expressStops = {0,1,4,8,12,14,15,16,20,24,28,29};
    private int expressIndex;

    public Bus(int stop){
        capacity=50;
        currentTime =0;
        passengerCount=0;
        this.stop = stop;
        expressIndex = 0;
    }

    public int getStop(){
        return stop;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getPassengers(){
        return passengerCount;
    }
    public boolean isExpress(){
        if(this.isExpress==true) {
            return true;
        }
        else{
            return false;
        }
    }
    public int nextExpress(){//determines next express stop (see BusEvent)
        if(expressStops[expressIndex] == 29) {
            expressIndex = 0;
            return expressIndex;
        }
        else{
            expressIndex++;
            return expressStops[expressIndex];
        }
    }
    public void setStop(int stop){
        this.stop = stop;
    }
    public String toString(){
        String retString = "";

        for(int i = 0; i < bus.length; i++){
            if(bus[i] != null) {
                retString += "Rider" + i + ": " + bus[i].getDropBusStop() + " " + bus[i].getBoardBusStop() + " | ";
            }
        }
        return retString;
    }

    public boolean isFull(){
        if(passengerCount == 50){
            return true;
        }
        else{
            return false;
        }

    }

}
