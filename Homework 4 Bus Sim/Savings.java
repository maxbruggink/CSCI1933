public class Savings implements BankAccount {
 private double balance;
 private int number = 1;
 private String owner;
 public static int count;
 public void getBalance() {
 System.out.println("Savings Balance: " + balance); }
 public int getNumber() {
 number = count++;
 return number; }
 public void updateBalance(double amount) {
 balance = balance + amount; }
 public String getOwner() {
 return owner; }
 public String toString() {
 return "intentionally blank: " + count; }
}
