//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Objects;
import java.util.Random;
public class BusSim {
    public static PQ agenda = new PQ();
    public static Stop busStops = new Stop();
    public static Statistics stat = new Statistics();


    public static void main(String[] args) {

        Random rand = new Random();

        for (int i = 0; i < 22; i++) {
            BusSim.agenda.add(new BusEvent(i, false, new Bus(i)), 0);
        }
        for (int i = 0; i < 5; i++){
            BusSim.agenda.add(new BusEvent(i, true, new Bus(i* 3)), 0);
        }



        RiderEvent stop0 = new RiderEvent(0);
        agenda.add(stop0, 0);
        RiderEvent stop1 = new RiderEvent(1);
        agenda.add(stop1, 0);
        RiderEvent stop2 = new RiderEvent(2);
        agenda.add(stop2, 0);
        RiderEvent stop3 = new RiderEvent(3);
        agenda.add(stop3, 0);
        RiderEvent stop4 = new RiderEvent(4);
        agenda.add(stop4, 0);
        RiderEvent stop5 = new RiderEvent(5);
        agenda.add(stop5, 0);
        RiderEvent stop6 = new RiderEvent(6);
        agenda.add(stop6, 0);
        RiderEvent stop7 = new RiderEvent(7);
        agenda.add(stop7, 0);
        RiderEvent stop8 = new RiderEvent(8);
        agenda.add(stop8, 0);
        RiderEvent stop9 = new RiderEvent(9);
        agenda.add(stop9, 0);
        RiderEvent stop10 = new RiderEvent(10);
        agenda.add(stop10, 0);
        RiderEvent stop11 = new RiderEvent(11);
        agenda.add(stop11, 0);
        RiderEvent stop12 = new RiderEvent(12);
        agenda.add(stop12, 0);
        RiderEvent stop13 = new RiderEvent(13);
        agenda.add(stop13, 0);
        RiderEvent stop14 = new RiderEvent(14);
        agenda.add(stop14, 0);
        RiderEvent stop15 = new RiderEvent(15);
        agenda.add(stop15, 0);
        RiderEvent stop16 = new RiderEvent(16);
        agenda.add(stop16, 0);
        RiderEvent stop17 = new RiderEvent(17);
        agenda.add(stop17, 0);
        RiderEvent stop18 = new RiderEvent(18);
        agenda.add(stop18, 0);
        RiderEvent stop19 = new RiderEvent(19);
        agenda.add(stop19, 0);
        RiderEvent stop20 = new RiderEvent(20);
        agenda.add(stop20, 0);
        RiderEvent stop21 = new RiderEvent(21);
        agenda.add(stop21, 0);
        RiderEvent stop22 = new RiderEvent(22);
        agenda.add(stop22, 0);
        RiderEvent stop23 = new RiderEvent(23);
        agenda.add(stop23, 0);
        RiderEvent stop24 = new RiderEvent(24);
        agenda.add(stop24, 0);
        RiderEvent stop25 = new RiderEvent(25);
        agenda.add(stop25, 0);
        RiderEvent stop26 = new RiderEvent(26);
        agenda.add(stop26, 0);
        RiderEvent stop27 = new RiderEvent(27);
        agenda.add(stop27, 0);
        RiderEvent stop28 = new RiderEvent(28);
        agenda.add(stop28, 0);
        RiderEvent stop29 = new RiderEvent(29);
        agenda.add(stop29, 0);

        while (agenda.getCurrentTime() <= (3600)*4) {
            agenda.remove().run();
        }
        for(int i=0;i<=29;i++){
          System.out.println("The line for stop " +i+" is " + Stop.busStops[i].length());
        }

/*
        System.out.println("The line for stop 0 is " + Stop.busStops[0].length());
        System.out.println("The line for stop 1 is " + Stop.busStops[1].length());
        System.out.println("The line for stop 2 is " + Stop.busStops[2].length());
        System.out.println("The line for stop 3 is " + Stop.busStops[3].length());
        System.out.println("The line for stop 4 is " + Stop.busStops[4].length());
        System.out.println(Stop.busStops[5].length());
        System.out.println(Stop.busStops[6].length());
        System.out.println(Stop.busStops[7].length());
        System.out.println(Stop.busStops[8].length());
        System.out.println(Stop.busStops[9].length());
        System.out.println(Stop.busStops[10].length());
        System.out.println(Stop.busStops[11].length());
        System.out.println(Stop.busStops[12].length());
        System.out.println(Stop.busStops[13].length());
        System.out.println("The line for stop 14 is " + Stop.busStops[14].length());
        System.out.println("The line for stop 15 is " + Stop.busStops[15].length());
        System.out.println("The line for stop 16 is " + Stop.busStops[16].length());
        System.out.println(Stop.busStops[17].length());
        System.out.println(Stop.busStops[18].length());
        System.out.println(Stop.busStops[19].length());
        System.out.println(Stop.busStops[20].length());
        System.out.println(Stop.busStops[21].length());
        System.out.println(Stop.busStops[22].length());
        System.out.println(Stop.busStops[23].length());
        System.out.println(Stop.busStops[24].length());
        System.out.println(Stop.busStops[25].length());
        System.out.println(Stop.busStops[26].length());
        System.out.println(Stop.busStops[27].length());
        System.out.println(Stop.busStops[28].length());
        System.out.println("The line for stop 29 is " + Stop.busStops[29].length());
*/
        System.out.println("Average Wait Time: " + stat.getMeanWait());
        System.out.println("Max Wait Time " + stat.getMaxWaitTime());
        System.out.println("Max Queue Length: " + stat.getMaxQueueL());
        System.out.println("Average Bus Capacity: " + stat.getAveBusCap());
        System.out.println("Average Time on Bus: " + stat.getAveTimeOnBus());


        //  System.out.println("Island 1, Number of Passengers in Line: "+FerrySim.lines[1].length());


    }

//System.out.println("Island 1, Number of Passengers in Line: "+FerrySim.lines[1].length());

}
