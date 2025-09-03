//ACCHIVING ABSTRACTION USING ABSTRACT CLASS
import java.util.Scanner;

//Abstraction example 
abstract class Bank
{
    public String Name="Aditya_Bank";
    public String Ifsc="mybank123";

    public void bankDetails()
    {
        System.out.println("Bank name is..."+Name+" "+"Bank ifsc code is..."+Ifsc);
    }
    //password is 123
    abstract void Deposite();
    abstract void Withdraw();
    abstract void checkBal();
}
class bankService extends Bank
{
    private double bal=5000;
    private  int pwd;
    public double money;

     public void Deposite()
    {
        System.out.println("Enter the password!...");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if (pwd==123)
        {
            System.out.println("Enter amount to Deposite...");
            money=s.nextDouble();
            bal=bal+money;
            System.out.println("Deposited money..." +money);
            System.out.println("Total balance is..."+bal);
        }
        else
        {
            System.out.println("Incorrect passsword...");
        }
    }

     public void Withdraw()
    {
        System.out.println("Enter the password!...");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if (pwd==123)
        {
            System.out.println("Enter amount to withdraw...");
            money=s.nextDouble();
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
        bankService b=new bankService();
        b.bankDetails();
        int ch;
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balamnce");

        System.out.println("Enter your choise....");
        Scanner s2=new Scanner(System.in);
        ch=s2.nextInt();
        switch (ch)
        {
            case 1: b.Deposite();
            break;
            case 2: b.Withdraw();
            break;
            case 3: b.checkBal();
            break;
            default:System.out.println("Enter a valid choise...");
        }
    }
}
