

//Rectangle class which is called by canvas to draw fractals
import java.awt.*;
public class Rectangle {
private double xVal;
private double yVal;
private double h;
private double w;
private double perimeter;
private double area;
private Color color;
public static void main(String args[]){
}

public Rectangle(double pos_x,double pos_y, double width,double height){
        this.xVal= pos_x;
        this.yVal= pos_y;
        this.w= width;
        this.h=height;
}
public double calculatePerimeter(){
        perimeter= (2*w)+(2*h);
        return perimeter;
}
public double calculateArea(){
        area = h*w;
        return area;
}
public void setColor(Color c){
        this.color = c;
}
public void setPos(double pos_x,double pos_y){
  this.xVal= pos_x;
  this.yVal=pos_y;
}
public void setHeight(double height){
this.h = height;
}
public void setWidth(double width){
  this.w = width;
}
public Color getColor(){
        return color;
}
public double getXPos(){
        return xVal;
}
public double getYPos(){
        return yVal;
}
public double getHeight(){
        return h;
}
public double getWidth(){
        return w;
}

}
