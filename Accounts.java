import java.util.Scanner;
public class Accounts
 {
               public static void main(String[] args)
             {
                 Account prabuaccount = new Account("Prabu", 1000.00);
                 Account siddhikaccount = new Account("Siddhik", -2.53);
                 System.out.printf("%s balance: $%.2f%n",
                    prabuaccount.getName(), prabuaccount.getBalance());
                 System.out.printf("%s balance: $%.2f%n%n",
                         siddhikaccount.getName(), siddhikaccount.getBalance());
                 Scanner input = new Scanner(System.in);
                 System.out.print("Enter deposit amount for prabu account: ");
                 double depositAmount = input.nextDouble();
                 System.out.printf("%nadding %.2f to prabu balance%n%n",
                    depositAmount);
                 prabuaccount.deposit(depositAmount);
                 System.out.printf("%s balance: $%.2f%n",
                    prabuaccount.getName(), prabuaccount.getBalance());
                 System.out.printf("%s balance: $%.2f%n%n",
                         siddhikaccount.getName(), siddhikaccount.getBalance());
                 System.out.print("Enter deposit amount for siddhik account: ");
                 depositAmount = input.nextDouble();
                 System.out.printf("%nadding %.2f to siddhik balance%n%n",
                    depositAmount);
                 siddhikaccount.deposit(depositAmount);
                 System.out.printf("%s balance: $%.2f%n",
                    prabuaccount.getName(), prabuaccount.getBalance());
                 System.out.printf("%s balance: $%.2f%n%n",
                         siddhikaccount.getName(), siddhikaccount.getBalance());
              }
           }