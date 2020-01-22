public class BusEvent implements Event {
    private int currentStop;
    private Q<Rider> LineForStop;
    private int leaveCount=0;
    private int lineAdd=0;
    private Bus bus;
    private boolean isExpress;


    public BusEvent(int CurrStop, boolean isExpress, Bus bus){
        currentStop = CurrStop;
        this.isExpress = isExpress;
        this.bus = bus;

    }

    public void run(){
//        System.out.println(this.currentStop);
//        BusSim.stat.setMaxQueue(BusSim.busStops.busStops[this.currentStop].length());
        BusSim.stat.setAveBusCapStat(bus.passengerCount);
        BusSim.stat.setMaxQueue(BusSim.busStops.busStops[this.currentStop].length());

        for (int i = 0; i < 50; i++) {
            if (bus.bus[i] != null && bus.bus[i].getDropBusStop() == this.currentStop) {
                BusSim.stat.setTimeOnBus(BusSim.agenda.getCurrentTime() - bus.bus[i].getTimeOfBoard());
                bus.bus[i] = null;
                leaveCount += 1;
                bus.passengerCount--;
            }
        }
        //add riders to Bus
        for (int i = 0; i < bus.bus.length; i++) {
            if (BusSim.busStops.busStops[this.currentStop].length() > 0) {
                //means there is space on bus
                if (bus.bus[i] == null) {
                    bus.bus[i] = BusSim.busStops.busStops[this.currentStop].remove();
                    lineAdd += 1;
                    bus.passengerCount += 1;
                    if (bus.bus[i] != null) {
                        BusSim.stat.updateStats(BusSim.agenda.getCurrentTime() - bus.bus[i].getArrivalTime());//don't make sense
                        BusSim.stat.setMaxWaitTime(BusSim.agenda.getCurrentTime() - bus.bus[i].getArrivalTime());
                        BusSim.stat.setTimeOnBus(BusSim.agenda.getCurrentTime());
                    }
                }
            }
        }

        //rescheduling bus event
        if(this.isExpress == false) {
            if(currentStop == 29){
                this.currentStop = 0;
                BusSim.agenda.add(new BusEvent(this.currentStop, this.isExpress, this.bus), getNextScheduledTime());
            } else {
                ++this.currentStop;
                BusSim.agenda.add(new BusEvent(this.currentStop, this.isExpress, this.bus), getNextScheduledTime());
            }
        }
// rescheduling if bus is express
        else if (this.isExpress == true) {
            this.currentStop = bus.nextExpress();
            BusSim.agenda.add(new BusEvent(currentStop, this.isExpress, this.bus), getNextScheduledTime());
        }
        System.out.println(currentStop);
        System.out.println(bus.toString());
    }

    public double getNextScheduledTime(){
        // currentTime+Time it takes to unload bus+ Time it takes to load bus
            //      int lineCount=0;
            //      Q<Rider> BusLine = BusEvent.getLineForBus();
            int timeToWait;
            double currentTime= BusSim.agenda.getCurrentTime();
            if( (2*leaveCount)+(3*lineAdd) > 15) {
                timeToWait =   240+(2*leaveCount)+(3*lineAdd);
                return timeToWait;
            }
            else{
                return 240+15;
        }

    }

    public Q<Rider> getLineForBus() {
        LineForStop = BusSim.busStops.busStops[currentStop];
        return LineForStop;
    }

/*        if (people on bus) {
            deboard
            waitTime+=2* people you deboarded
            schedule to come back in waittime
        }
        else {
            while (people in line and bus not full) {
                onboard'
                waittime += 3'
            }
            if (bus full or waittime > 15) {
               send bus out with time travel time + onboarding time
                    waititme = 0
            }
            else {
                reschedule for one second later
                        waittime=1
            }
        }*/
}
