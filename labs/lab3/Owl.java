public class Owl {
private String owlName;
private int owlAge;
private double owlWeight;
public static void main(String[] args) {
        Owl owl1 = new Owl("ted",12,13.2);
        Owl owl2 = new Owl("td",12,13.2);
  boolean x = owl1.equals(owl2);

  if(x==true){
    System.out.println("they are equal");
  }
  else{System.out.println("they are not equal");}
}
public Owl(String name,int age,double weight){
this.owlName=name;
this.owlAge=age;
this.owlWeight=weight;
}
public boolean equals(Owl other){
  if (owlName==other.owlName && owlAge==other.owlAge && owlWeight==other.owlWeight){
    return true;

  }
  else{return false;}
}
public String getName(){
  return owlName;
}
public void setName(String name){
  this.owlName=name;
}
public int getAge(){
  return owlAge;
}
public void setAge(int age){
  this.owlAge=age;
}
public double getWeight(){
  return owlWeight;
}
public void setWeight(double weight){
  this.owlWeight=weight;
}
}
