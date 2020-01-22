import java.util.Scanner;
public class BankAccount{
  private String name;
  private String password;
  private double balance;
  public static void main(String args[]){
    BankAccount myAccount = new BankAccount("Java","csci1933",100.50);


  //  BankAccount otherAccount = new BankAccount();
  //  myAccount.password="csci1933";
  //  myAccount.deposit("csci1933",100.50);

  //  otherAccount.password= "max";
//      otherAccount.deposit("max",10.34);
  //  System.out.println(otherAccount.balance);
  System.out.println("What is your password?");
  Scanner myScanner = new Scanner(System.in);
  String input = myScanner.nextLine();

  System.out.println(myAccount.getBalance(input));

  }
  public BankAccount(String initName,String initPass, double initBalance){
    this.name= initName;
    this.password=initPass;
    this.balance=initBalance;
  }
  public void withdraw(String enteredPassword, double amount){
    // Only People with the right password and sufficient funds can with withdraw
    if (password.equals(enteredPassword)&& balance>= amount){
      balance = balance-amount;

    }
}
public void deposit(String enteredPassword,double amount){
  if(password.equals(enteredPassword)){
    balance= balance+amount;
  }
}
public double getBalance(String enteredPassword){
  if(password.equals(enteredPassword)){
    return balance;
  }
  else{
    return -1;
  }
}
public boolean setPassword(String oldPassword,String newPassword){
  if(password.equals(oldPassword)){
    password=newPassword;
    return true;
  }
  else{
    return false;
  }
}



}
