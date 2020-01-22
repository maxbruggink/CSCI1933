
public class Max {
public static void main(String args[]){
        System.out.println(recursiveMaxDigit(578)); //will return 8
        System.out.println(recursiveMaxDigit(10)); //will return 1
System.out.println(recursiveMaxDigit(134647280));
System.out.println(iterativeMaxDigit(10));

//System.out.println("Updated");

}

public static int recursiveMaxDigit(int num){
        if (num>0) {
                int right = num%10;
                int maxNum= recursiveMaxDigit(num/10);
                return Math.max(right,maxNum);

        }
        else{
                return 0;
        }


}
public static int iterativeMaxDigit(int num){
        int max;
        max = 0;
        int farRight;

        while (num!=0) {
                farRight=num%10;
                num= num/10;
                if(farRight>max) {
                        max=farRight;
                }

        }
        return max;
}


}
