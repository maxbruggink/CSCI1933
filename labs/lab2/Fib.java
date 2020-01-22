import java.util.Scanner;
public class Fib {
public static void main(String args[]){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What number in the sequence?");
        int input = myScanner.nextInt();
        System.out.println("The number would be " + fibbonacciRecursive(input));
}
public static int fibbonacciRecursive(int n){
        if(n==0) {
                return 0;
        }
        else if(n==1) {
                return 1;
        }
        else{
                return fibbonacciRecursive(n-1)+fibbonacciRecursive(n-2);
        }
}

}
