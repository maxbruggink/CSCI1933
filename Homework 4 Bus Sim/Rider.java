import java.util.Random;

/**CSCI 1933 Lab 11 Passenger.java general idea*/

public class Rider {
    private int boardBusStop;
    private int dropBusStop;
    private int[] stopSelect = {0, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 14, 15, 15, 16, 16,
            17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 29};
    private double arrivalTime;
    private double timeOfBoard;


    public Rider(int boardBusStop) {
        this.boardBusStop = boardBusStop;
        this.arrivalTime = BusSim.agenda.getCurrentTime();
        this.timeOfBoard = 0;
        Random rand = new Random();
        if (boardBusStop >= 0 && boardBusStop < 15) {
            dropBusStop = stopSelect[rand.nextInt(19)];
            while (dropBusStop <= boardBusStop) {
                dropBusStop = stopSelect[rand.nextInt(19)];
            }
        } else if (boardBusStop >= 15 && boardBusStop <= 29) {
            dropBusStop = stopSelect[rand.nextInt(stopSelect.length - 1)];
            while (dropBusStop <= boardBusStop && dropBusStop != 0) {
                dropBusStop = stopSelect[rand.nextInt(35)];
            }
        }
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public int getDropBusStop () {
        return dropBusStop;
    }

    public int getBoardBusStop(){
        return this.boardBusStop;
    }
    public void setTimeOfBoard(double timeBoard) {
        this.timeOfBoard = timeBoard;
    }
    public double getTimeOfBoard(){
        return timeOfBoard;
    }

}