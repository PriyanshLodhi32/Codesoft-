import java.util.Scanner;

public class Atmmachine {
    public static void main(String[] args) {
        int balance=100000,withdraw , deposit ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number 1,2,3,4");
        System.out.println("1.Withdraw \n 2.Deposit \n 3.Check Balance \n 4.Change Pin " );
        int values= sc.nextInt();
        switch (values){
            case 1:
                System.out.println("Withdraw");
                System.out.println("How much money you want to withdraw : ");
                withdraw= sc.nextInt();
                    if (balance>=withdraw){
                        balance=balance-withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficent Balance");
                    }
                System.out.println("Remaining Balance is ");
                System.out.println(balance-withdraw);
                break;
            case 2:
                System.out.println("Deposit");
                System.out.println("How much money you want to deposit :");
                deposit= sc.nextInt();
                balance=balance-deposit;
                System.out.println("Succesfully Deposited");
                System.out.println("Available Balance : ");
                System.out.println(balance+deposit);
                break;
            case 3:
                System.out.println("Check Balance : ");
                System.out.println("Your balance : "+balance);
                break;
            case 4:
                System.out.println("Change Pin");
                System.out.println("Enter account details");
                break;
        }
        System.out.println("Thank You for Using !!!");
    }
}
