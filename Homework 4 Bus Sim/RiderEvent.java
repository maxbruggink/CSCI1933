import java.util.Random;
public class RiderEvent implements Event{
    private int stop;
    public static int lineCount=0;
    public RiderEvent(int stop){
        this.stop=stop;

    }

    // method borrowed from CarMaker2 in CSCI 1933 canvas
    public static int getRandom(int low,int high){

        Random rand=new Random();
        int randomNumber = rand.nextInt((high-low)+1)+low;
        return randomNumber;
        //  return (int) Math.floor((high-low)*Math.random()+ low +0.5);
    }
    public int getStop(){
        return stop;
    }

    public void run(){
        int[] stopSelect = {0, 0, 1, 1, 29, 29, 14, 14, 15, 15, 16, 16,
                2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
        double[] arrivalPercents = {.75, .75, .5, .5, .5, .2, .2, .2, .2, 0, 0, -.2, -.2, -.2, -.5, -.5, -.5, -.75, -.75};
        int randomPercent = getRandom(0,18);
        double TimeInterval = (120+(arrivalPercents[randomPercent]*120))/1.5;
        int randNum = getRandom(0,35);
        int stop = stopSelect[randNum];
        Rider newRider = new Rider(stop);
        BusSim.agenda.add(new RiderEvent(stop),TimeInterval);
        BusSim.busStops.busStops[stop].add(newRider);
        lineCount+=1;
    }

}
