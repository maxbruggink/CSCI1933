public class Bank {
 public static void main(String[] args) {
 //BankAccount a1 = new BankAccount();
 BankAccount a2 = new Savings();
 Savings s1 = new Savings();
 Savings s2 = s1;
 Savings s3 = new PremierSavings();
 Object s4 = new Savings();
 //PremierSavings p1 = new Savings();
 //PremierSavings p2 = new BankAccount();
 s1.updateBalance(100.00);
 s2.updateBalance(50.00);
 System.out.println("Line 1: " + a2.toString());
 System.out.println("line 2: " + s1.toString());
 System.out.println("line 3: " + s2.toString());
 System.out.println("line 4: " + s3.toString());
 System.out.println("line 5: " + s4.toString());
 //System.out.println("line 6: " + s3.getCardNumber());
 System.out.println("line 7: ");
 s1.getBalance();
 System.out.println("line 8: ");
 s2.getBalance();
 System.out.println("line 9: " + s3.getNumber());
 System.out.println("line 10: " + s2.getNumber());
 System.out.println("line 11: " + s3.toString());
 System.out.println("line 12: " + s4.toString()); }
}
