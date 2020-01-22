public class Postfix {
public static double evaluate(String[] expression){
        Stack S = new Stack();
        for(int i=0; i<expression.length; i++) {
if (expression[i].type().equals(int)){
  S.push(S,expression[i]);
}
else{
  int num1 = Pop(S);
  int num2= Pop(S);
  S.push(S,num2())
}
        }
}




}
