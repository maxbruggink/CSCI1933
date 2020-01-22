public class Stack<T extends Comparable<T> > {
int size;
T[] ar;
public static void main(String[] args) {
        Stack aa = new Stack();
        try{aa.push("helo");}
        catch(StackException e){
          System.out.println("Your array is full");}
          System.out.println(aa.pop());
}
public Stack(){
        ar = (T[]) new Comparable[5];
        this.size=0;
}
public Stack(int size){
        ar = (T[]) new Comparable[size];
        this.size = 0;
}
public T pop(){
        if(size<=0) {
                return null;
        }
        T currVal = ar[--size];

        return currVal;
}
public void push(T item) throws StackException {
        if(size==ar.length) {
                throw new StackException(size);
        }
        else{
                ar[size++]=item;

        }
}

}
