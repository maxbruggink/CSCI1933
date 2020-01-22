public class SparseVector {

private Node head;
private int length;

public SparseVector(int len){
								head = null;
								length = len;
}

// Prints out a sparse vector (including zeros)
public String toString(){

								String result = "";
								Node currNode = head;
								int currIndex = 0;
								while( currNode != null ) {
																int idx = currNode.getIndex();

																// Pad the space between nodes with zero
																while( currIndex < idx ) {
																								result += "0, ";
																								currIndex++;
																}
																result += currNode;
																currNode = currNode.getNext();
																currIndex++;

																// Only add a comma if this isn't the last element
																if( currNode != null ) { result += ", "; }
								}
								return result;
}

// TODO: Implement me for milestone 1
public void addElement(int index, double value){
								Node currentNode = head;
								if(head==null) {
																head = new Node(index,value);
																return;
								}

								while (currentNode.getNext()!= null) {
																currentNode= currentNode.getNext();
								}
								currentNode.setNext(new Node(index,value));
}

// TODO: Implement me for milestone 2
public double dot(SparseVector y ){
								double result= 0.0;
								Node currentNodeY= y.head;
								Node currentNodeX= this.head;

								if((this.length==y.length)&&(this.head!=null && y.head!=null)) {
																while(currentNodeX!=null) {
																								currentNodeY= y.head;
																								while(currentNodeY!=null) {
																																if(currentNodeX.getIndex()==currentNodeY.getIndex()) {
																																								result+=currentNodeX.getValue()*currentNodeY.getValue();
																																}
																																currentNodeY= currentNodeY.getNext();
																								}
																								currentNodeX= currentNodeX.getNext();
																}
								}
								return result;
}

public void removeElement(int index){

}

// TODO: Test out your code here!
public static void main(String[] args) {
								SparseVector x = new SparseVector(100000000);
								x.addElement(0, 1.0);
								x.addElement(10000000, 3.0);
								x.addElement(10000001, -2.0);
								SparseVector y = new SparseVector(100000000);
								y.addElement(0, 2.0);
								y.addElement(10000001, -4.0);
								double result = x.dot(y);
								System.out.println(result);

}
}
