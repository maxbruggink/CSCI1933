
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.BufferedReader;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Canvas extends JApplet {

public static void main(String[] args) {

// Setting inital values for all the shapes.
								int canvasWidth = 800;
								int canvasHeight = 800;




								double rectPos_x=250;
								double rectPos_y=250;
								double rectWidth=rectPos_x*.9;
								double rectHeight=rectPos_y*.9;

								double triPos_x=400;
								double triPos_y=400;
								double triWidth=triPos_x/2;
								double triLength=triPos_y/2;

								double circlePos_x=400;
								double circlePos_y=400;
								double radius=200;


								Scanner inputScanner = new Scanner(System.in);
								System.out.println("What shape do you want to make? (Circle,Triangle,Rectangle)");
								String userInput = inputScanner.nextLine();

// Checking if input values are same then running according function.
								if (userInput.equals("circle") || userInput.equals("Circle")) {
																Canvas drawing = new Canvas(canvasWidth,canvasHeight);
																fractalCircle(drawing,circlePos_y,circlePos_y,radius);
								}
								else if (userInput.equals("rectangle") || userInput.equals("Rectangle")) {
																Canvas drawing = new Canvas(canvasWidth,canvasHeight);
																fractalRect(drawing,rectPos_x,rectPos_y,rectWidth,rectHeight);
								}
								else if (userInput.equals("triangle") || userInput.equals("Triangle")) {
																Canvas drawing = new Canvas(canvasWidth,canvasHeight);
																fractalTriangle(drawing,triPos_x,triPos_y,triWidth,triLength);
								}
								else{
																System.out.println("Choose another input");
								}

}


//Fractal circle design where draw inital circle then recursively make circles at each point.
public static void fractalCircle(Canvas drawing,double pos_x,double pos_y,double radius){
								if(radius>=1) {
																Circle newCircle = new Circle(pos_x,pos_y,radius);
																newCircle.setColor(Color.BLUE);
																drawing.drawShape(newCircle);
																fractalCircle(drawing,pos_x-radius,pos_y-radius,radius/2);
																fractalCircle(drawing,pos_x+radius,pos_y-radius,radius/2);
																fractalCircle(drawing,pos_x+radius,pos_y+radius,radius/2);
																fractalCircle(drawing,pos_x-radius,pos_y+radius,radius/2);

								}
}
//Fractal rectangle design where draw inital rectangle then recursively make rectangles at each point.
public static void fractalRect(Canvas drawing,double pos_x,double pos_y, double width,double height){
								if(width>=1) {

																Rectangle newRect = new Rectangle(pos_x,pos_y,width,height);
																newRect.setColor(Color.BLUE);
																drawing.drawShape(newRect);
																fractalRect(drawing,pos_x-(width/2),pos_y-(height/2),width/2,height/2);
																fractalRect(drawing,pos_x+width,pos_y-(height/2),width/2,height/2);
																fractalRect(drawing,pos_x+width,pos_y+height,width/2,height/2);
																fractalRect(drawing,pos_x-(width/2),pos_y+height,width/2,height/2);

								}
}
//Fractal triangle design where draw inital triangle then recursively make triangle at each point.
public static void fractalTriangle(Canvas drawing,double pos_x, double pos_y, double width, double height){
								if (width>=1) {
																Triangle newTri = new Triangle(pos_x,pos_y,width,height);
																newTri.setColor(Color.BLUE);
																drawing.drawShape(newTri);
																fractalTriangle(drawing,pos_x-(width/4),pos_y+(height/2),width/2,height/2);
																fractalTriangle(drawing,pos_x+(width/1.33),pos_y+(height/2),width/2,height/2);
																fractalTriangle(drawing,(pos_x)+width/4,pos_y-(height),width/2,height/2);



								}
}


private int height;
private int width;
private LinkedList<Circle> circles;
private LinkedList<Rectangle> rectangles;
private LinkedList<Triangle> triangles;

public Canvas() {
								JFrame f = new JFrame("Canvas");
								f.addWindowListener(new WindowAdapter(){
																								public void windowClosing(WindowEvent e) {
																																System.exit(0);
																								}
																});
								height = 800;
								width = 800;
								f.setSize(width, height);
								f.getContentPane().add(this);
								circles = new LinkedList<Circle>();
								rectangles = new LinkedList<Rectangle>();
								triangles = new LinkedList<Triangle>();
								f.setVisible(true);
}

public Canvas(int h, int w) {
								JFrame f = new JFrame("Canvas");
								f.addWindowListener(new WindowAdapter(){
																								public void windowClosing(WindowEvent e) {
																																System.exit(0);
																								}
																});
								height = h;
								width = w;
								f.setSize(width, height);
								f.getContentPane().add(this);
								circles = new LinkedList<Circle>();
								rectangles = new LinkedList<Rectangle>();
								triangles = new LinkedList<Triangle>();
								f.setVisible(true);
}

public synchronized void paint(Graphics g) {
								ListIterator<Circle> circItr = circles.listIterator();
								ListIterator<Rectangle> recItr = rectangles.listIterator();
								ListIterator<Triangle> triItr = triangles.listIterator();

								while (circItr.hasNext()) {
																Circle curCircle = circItr.next();
																g.setColor(curCircle.getColor());
																int curRadius = (int)curCircle.getRadius();
																g.fillOval((int)curCircle.getXPos() - curRadius, (int)curCircle.getYPos()
																											- curRadius, 2 * curRadius, 2 * curRadius);

								}

								while (recItr.hasNext()) {
																Rectangle curRectangle = recItr.next();
																g.setColor(curRectangle.getColor());
																g.fillRect((int)curRectangle.getXPos(), (int)curRectangle.getYPos(),
																											(int)curRectangle.getWidth(), (int)curRectangle.getHeight());
								}

								while (triItr.hasNext()) {
																Triangle curTriangle = triItr.next();
																g.setColor(curTriangle.getColor());
																Polygon po = new Polygon();
																po.addPoint((int)curTriangle.getXPos(), (int)curTriangle.getYPos());
																po.addPoint((int)(curTriangle.getXPos() + curTriangle.getWidth()), (int)curTriangle
																												.getYPos());
																po.addPoint((int)(curTriangle.getXPos() + curTriangle.getWidth() / 2), (int)(curTriangle.getYPos() - curTriangle.getHeight()));
																g.fillPolygon(po);
								}
}


public synchronized void drawShape(Circle circ){

								circles.add(circ);


}

public synchronized void drawShape(Rectangle rec){
								rectangles.add(rec);
}

public synchronized void drawShape(Triangle tri){
								triangles.add(tri);
}

public synchronized void clear(){
								circles.clear();
								rectangles.clear();
								triangles.clear();
}


}
