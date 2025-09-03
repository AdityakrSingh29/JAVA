
import java.util.Scanner;

//ENCAPSULATION EXAMPLE
class Bank
{
    private double bal=5000;
    private int pwd;

    public void Deposite(double money)
    {
        System.out.println("Enter the password!...");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if (pwd==123)
        {
            bal=bal+money;
            System.out.println("Deposited money..." +money);
            System.out.println("Total balance is..."+bal);
        }
        else
        {
            System.out.println("Incorrect passsword...");
        }
    }

      public void Withdraw(double money)
    {
        System.out.println("Enter the password!...");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if (pwd==123)
        {
            bal=bal-money;
            System.out.println("Deposited money..." +money);
            System.out.println("Total balance is..."+bal);
        }
        else
        {
            System.out.println("Incorrect passsword...");
        }
    }
    public void checkBal()
    {
        System.out.println("Enter a password...");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==123)
        {
            System.out.println("Total blacnce is..."+bal);
        }
        else{
            System.out.println("Incorrect password...");
        }
    }
}

class customer
{
    public static void main(String[] args) {
        Bank b=new Bank();
        int ch;
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balamnce");

        System.out.println("Enter your choise....");
        Scanner s2=new Scanner(System.in);
        ch=s2.nextInt();
        switch (ch)
        {
            case 1: b.Deposite(1000);
            break;
            case 2: b.Withdraw(2000);
            break;
            case 3: b.checkBal();
            break;
            default:System.out.println("Enter a valid choise...");
        }
    }
}