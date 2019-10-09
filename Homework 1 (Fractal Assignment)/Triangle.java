//Triangle class which is called by canvas to draw fractals
import java.awt.*;
public class Triangle {
  private double xVal;
  private double yVal;
  private double h;
  private double w;
  private double perimeter;
  private double area;
  private Color color;
public static void main(String args[]){
}
public Triangle(double pos_x, double pos_y, double width, double height){
  this.xVal=pos_x;
  this.yVal=pos_y;
  this.w= width;
  this.h= height;
}
public double calculatePerimeter(){
  perimeter= 3*w;
  return w;
}
public double calculateArea(){
  area = (w*h)/2;
  return area;
}
public void setColor(Color c){
  this.color= c;
}
public void setPos(double pos_x, double pos_y){
}
public void setHeight(double height){
  this.h=height;
}
public void setWidth(double width){
  this.w=width;
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
