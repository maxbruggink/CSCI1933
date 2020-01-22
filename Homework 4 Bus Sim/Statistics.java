public class Statistics {
    private double totalArrivalTime;
    private double  numPassengers;
    private double maxWaitTime;
    private int maxQueueL;
    private double busTotalCap; // no cap
    private double numStops;
    private double timeOnBus;
    private double totPassengerOnBus;

    public Statistics() {
        totalArrivalTime = 0;
        numPassengers = 0;
        maxWaitTime = 0;
        maxQueueL = 0;
        busTotalCap = 0;
        timeOnBus = 0;
        totPassengerOnBus = 0;
    }
    public void setAveBusCapStat( int busCap) {
        busTotalCap += busCap;
        numStops++;
    }
    public void setMaxQueue(int q){
        if(q > this.maxQueueL){
            this.maxQueueL = q;
        }
    }

    public void setMaxWaitTime(double maxWaitTime) {
        if(maxWaitTime > this.maxWaitTime){
            this.maxWaitTime = maxWaitTime;

        }
    }

    public void updateStats(double arrivalTime){
        this.totalArrivalTime += arrivalTime;
        this.numPassengers++;

    }

    public double getMeanWait(){
        return totalArrivalTime/numPassengers;
    }

    public double getMaxWaitTime() {
        return this.maxWaitTime;
    }
    public int getMaxQueueL(){
        return this.maxQueueL;
    }
    public double getAveBusCap(){
        return busTotalCap/numStops;
    }
    public void setTimeOnBus(double timeOnBus){
        this.timeOnBus += timeOnBus;
        this.totPassengerOnBus++;
    }
    public double getAveTimeOnBus(){
        return timeOnBus/totPassengerOnBus;
    }
}
