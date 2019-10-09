//Circle class which is called by canvas to draw fractals
import java.awt.*;
public class Circle {
private double x;
private double y;
private Color color;
private double Circleradius;
private double h;
private double w;

public static void main(String args[]){

}
public Circle(double pos_x, double pos_y, double radius){
        this.x= pos_x;
        this.y= pos_y;
        this.Circleradius=radius;
}
public double calculatePerimeter(){
        double perimeter=2.0*3.14*(Circleradius*Circleradius);
        return perimeter;
}

public double calculateArea(){
        double area = 3.14 * Circleradius* Circleradius;
        return area;
}
public void setColor(Color c){
        this.color= c;
}
public void setPos(double pos_x,double pos_y){
        this.x=pos_x;
        this.y=pos_y;
}
public void setRadius(double radius){
  this.Circleradius=radius;

}
public Color getColor(){
        return color;
}
public double getXPos(){
        return x;
}
public double getYPos(){
        return y;
}
public double getRadius(){
  return Circleradius;
}



}
