public class Histogram {
public int upperbound;
public int lowerbound;
public int hist[];
public static void main(String args[]){
        int hist[]={2,3,4,6};
        
}
public Histogram(int lowerbound, int upperbound){
        if(upperbound<lowerbound) {
                upperbound=lowerbound;
                lowerbound=upperbound;
        }
}
public boolean add(int i){
        if (i>lowerbound&&i<upperbound) {
                hist[i]=i;
                return true;
        }
        else{
                return false;
        }
}
public String toString(){
        for(int i=0; i<hist.length; i++) {
          System.out.println(hist[i]);

        }

}
}
