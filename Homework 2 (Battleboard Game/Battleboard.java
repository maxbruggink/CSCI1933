//Written by brugg123

public class Battleboard {
private String[][] board;

public static void main(String[] args) {
}

public Battleboard(int row,int col){

        board= new String[row][col];

}


//Method to determine how many ships are to be placed
public void placeShips(){
        int row = board.length;
        int col = board[0].length;
        int shipNum=0;
        if(row==3||col==3) {
                shipNum=1;
        }
        else if (((3<row)&&(row<=6)) || ((3<col)&&(col<=6))) {
                shipNum=2;
        }
        else if (((6<row)&&(row<=8)) || ((6<col)&&(col<=8))) {
                shipNum=3;
        }
        else if (((8<row)&&(row<=10)) || ((8<col)&&(col<=10))) {
                shipNum=4;
        }
        else if  (((10<row)&&(row<=12)) || ((10<col)&&(col<=12))) {
                shipNum=6;
        }

// Keeps calling the ship location method until there are have reached the allocated amount
        for(int i =0; i<shipNum; i++) {
                boolean isShip=true;
                while(isShip==true) {
                        boolean Shiplogic = oneShip();
                        if (Shiplogic==true) {
                                isShip=false;
                        }
                }
        }
}
// Method to place ships based on whether the Space is empty or there is a ship already there
public boolean oneShip(){
        double orientation = Math.random();
        int row = board.length;
        int col = board[0].length;

        //Horizontal orientation of ship
        if(orientation<0.5) {

                int colNum = getRandom(0,col-1);

                int colBox = getRandom(0,col-1);
                if(board[colNum][colBox].equals("E")) {
                        board[colNum][colBox]="S";
                        // Checking cases where there would be out of bounds error first such as outside rows of grid
                        if (colBox==col-1) {
                                if(board[colNum][colBox-1].equals("E") && board[colNum][colBox-2].equals("E")) {
                                        board[colNum][colBox-1]="S";
                                        board[colNum][colBox-2]="S";
                                        return true;
                                }
                        }
                        else if(colBox==0) {
                                if(board[colNum][colBox+1].equals("E") && board[colNum][colBox+2].equals("E")) {
                                        board[colNum][colBox+1]="S";
                                        board[colNum][colBox+2]="S";
                                        return true;
                                }
                        }
                        else{
                                if(board[colNum][colBox+1].equals("E") && board[colNum][colBox-1].equals("E")) {
                                        board[colNum][colBox+1]="S";
                                        board[colNum][colBox-1]="S";
                                        return true;
                                }
                        }
                }
                else{board[colNum][colBox]="E";}
                return false;



        }

        //Vertical orientation of ship
        else{
                int rowNum = getRandom(0,row-1);
                int rowBox = getRandom(0,row-1);
                if(board[rowNum][rowBox].equals("E")) {
                        board[rowNum][rowBox]="S";
                        // Checking cases where there would be out of bounds error first such as outside rows of grid
                        if (rowNum==0) {
                                if(board[rowNum+1][rowBox].equals("E") && board[rowNum+2][rowBox].equals("E")) {
                                        board[rowNum+1][rowBox]="S";
                                        board[rowNum+2][rowBox]="S";
                                        return true;
                                }
                        }
                        else if(rowNum==row-1) {
                                if(board[rowNum-1][rowBox].equals("E") && board[rowNum-2][rowBox].equals("E")) {
                                        board[rowNum-1][rowBox]="S";
                                        board[rowNum-2][rowBox]="S";
                                        return true;
                                }
                        }
                        else{
                                if(board[rowNum+1][rowBox].equals("E") && board[rowNum-1][rowBox].equals("E")) {
                                        board[rowNum+1][rowBox]="S";
                                        board[rowNum-1][rowBox]="S";
                                        return true;
                                }
                        }
                }
                else{
                        board[rowNum][rowBox]="E";
                }

                return false;



        }
}
// Method to obtain random numbers
public int getRandom(int min,int max){
        int range = (max-min)+1;

        return (int)(Math.random()*range)+min;
}

public String toString(){
        String boardString="";
        for(int i=0; i<board.length; i++) {
                for(int j=0; j<board[i].length; j++) {
                        boardString+=board[i][j]+" ";
                }
                boardString+="\n";
        }
        return boardString;
}
// Initializes board before start of each game
public void initBoard(){
        for(int i=0; i<board.length; i++) {
                for(int j=0; j<board[i].length; j++) {
                        board[i][j]="E";
                }
        }
}
// Drone method to get values of user selected row and column
public String drone(int colChoice,int rowChoice){
        String columnString = "";
        String rowString = "";

        for(int i = 0; i<board.length; i++) {
                columnString+=board[i][colChoice]+"\n";

        }
        for(int i =0; i<board.length; i++) {
                rowString+=board[rowChoice][i]+" ";
        }
        String droneString = "The selected row values are: "+rowString+"\n"+ " The selected column values are:"+"\n"+columnString;
        return droneString;
}
// Cannon fire method to shoot at given location based on user input
public String fireCheck(int xCord, int yCord){
        String returnString="";
        int row = board.length;
        int col = board[0].length;
        if( (xCord>=row||xCord<0)||(yCord>=col||yCord<0) ) {
                returnString= "penalty";
        }
        else if(board[xCord][yCord].equals("E") ) {
                returnString= "miss";
        }
        else if(board[xCord][yCord].equals("S")) {
                board[xCord][yCord]="E";
                returnString = "hit";
        }

        return returnString;
}
// Method to determine at the end of each turn whether or not the game should end.
public boolean shipsRemain(){
        boolean shipsRemain=true;

        for(int i =0; i<board.length; i++ ) {
                for(int j=0; j<board[i].length; j++) {
                        if(board[i][j].equals("S")) {
                                shipsRemain=true;
                                return shipsRemain;
                        }

                }
        }
        return false;
}

}
