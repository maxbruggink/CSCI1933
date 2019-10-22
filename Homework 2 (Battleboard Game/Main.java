// Written by brugg123
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
        Scanner gameScanner = new Scanner(System.in);

        System.out.println("Normal or Debug Mode?");

        String modeString = gameScanner.nextLine();
// Checking whether or not to use debug or normal mode
        if(modeString.equals("debug")||modeString.equals("Debug")) {
                System.out.println("How many columns for your game?");

                int gameCol = gameScanner.nextInt();

                System.out.println("How many rows for your game?");

                int gameRow = gameScanner.nextInt();

                Battleboard gameBoard = new Battleboard(gameRow,gameCol);
// Calling functions from Battleboard class to initializes the board then place all the ships
                gameBoard.initBoard();

                gameBoard.placeShips();

                boolean shipsRemain = true;

                int turnCounter = 0;

                System.out.println(gameBoard);
                // While loop to keep running until there are no ships remaining
                while (shipsRemain==true) {
                        System.out.println("Cannon Fire or Recone Drone?");

                        String choice = gameScanner.nextLine();
// Checking whether or not the user wants to use a drone or cannon shot
                        if(choice.equals("Drone")||choice.equals("drone")) {
                                System.out.println("Choose a row to scan:");

                                int droneXChoice = gameScanner.nextInt();

                                System.out.println("Choose a column to scan:");

                                int droneYChoice = gameScanner.nextInt();

                                if( (droneYChoice<0||droneYChoice>=gameCol) || (droneXChoice<0||droneXChoice>=gameRow) ) {
                                        turnCounter+=5;
                                        System.out.println("Out of bounds! 4 turns added for drone to return and one penalty turn added!");
                                }
                                else{
// If user has chosen spot that is in bounds then calls the drone
                                        System.out.println(gameBoard.drone(droneYChoice,droneXChoice));

                                        turnCounter+=4;
                                }
                        }

// Will run if user has selected to shoot the cannon.
                        else if (choice.equals("cannon")||choice.equals("Cannon")) {
                                System.out.println("Choose a x coordinate:");

                                int xCord = gameScanner.nextInt();

                                System.out.println("Choose a y coordinate:");

                                int yCord = gameScanner.nextInt();

                                String fire = gameBoard.fireCheck(xCord,yCord);

                                if (fire.equals("penalty")) {
                                        turnCounter+=1;
                                }
                                else if (fire.equals("miss")) {
                                        turnCounter+=1;
                                }
                                else if (fire.equals("hit")) {
                                        turnCounter+=1;
                                }

                                System.out.println(fire);

                                System.out.println(gameBoard);

// Calls function in battleboard class to determine if the game has finished after each turn.
                                boolean ships =gameBoard.shipsRemain();

                                if(ships==false) {
                                        shipsRemain=false;

                                        System.out.println("Game over no ships remain! It took you "+turnCounter+" turns to complete the game.");

                                        System.exit(0);
                                }
                        }



                        else if (choice.equals("exit")) {
                                System.exit(0);
                        }
                }
        }

// Does same functionality as debug mode except will not print the board after every turn

        else if (modeString.equals("normal")||modeString.equals("Normal")) {

                System.out.println("How many columns for your game?");

                int gameCol = gameScanner.nextInt();

                System.out.println("How many rows for your game?");

                int gameRow = gameScanner.nextInt();

                Battleboard gameBoard = new Battleboard(gameRow,gameCol);
                gameBoard.initBoard();
                gameBoard.placeShips();
                boolean shipsRemain = true;
                int turnCounter = 0;
                while (shipsRemain==true) {
                        System.out.println("Cannon Fire or Recone Drone?");
                        String choice = gameScanner.nextLine();

                        if(choice.equals("Drone")||choice.equals("drone")) {
                                System.out.println("Choose a row to scan:");

                                int droneXChoice = gameScanner.nextInt();

                                System.out.println("Choose a column to scan:");

                                int droneYChoice = gameScanner.nextInt();

                                if( (droneYChoice<0||droneYChoice>=gameCol) || (droneXChoice<0||droneXChoice>=gameRow) ) {
                                        turnCounter+=1;
                                        System.out.println("Out of bounds an additional turn added!");
                                }
                                else{

                                        System.out.println(gameBoard.drone(droneYChoice,droneXChoice));

                                        turnCounter+=4;
                                }
                        }


                        else if (choice.equals("cannon")||choice.equals("Cannon")) {
                                System.out.println("Choose a x coordinate:");
                                int xCord = gameScanner.nextInt();
                                System.out.println("Choose a y coordinate:");
                                int yCord = gameScanner.nextInt();
                                String fire = gameBoard.fireCheck(xCord,yCord);
                                if (fire.equals("penalty")) {
                                        turnCounter+=1;
                                }
                                else if (fire.equals("miss")) {
                                        turnCounter+=1;
                                }
                                else if (fire.equals("hit")) {
                                        turnCounter+=1;
                                }
                                System.out.println(fire);
                                boolean ships =gameBoard.shipsRemain();
                                if(ships==false) {
                                        shipsRemain=false;
                                        System.out.println("Game over no ships remain! It took you "+turnCounter +" turns to complete the game.");
                                        System.exit(0);
                                }
                        }



                        else if (choice.equals("exit")) {
                                System.exit(0);
                        }
                }

        }

}

}
