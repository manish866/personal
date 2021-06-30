package practice;

class LessBal extends Exception
{
    float b;
    public LessBal(float amt)
    {
        b=amt;
        System.out.println("Withdraw amt is invalid"+b);
    }
}
class Account
{
    float bal;
    public Account (float b)
    {
        if(b<500)
        {
            System.out.println("No sufficient Balance");
        }
        else
        {
            bal=b;
        }
    }
    public void deposit(float amt)
    {
        bal+=amt;
        System.out.println("The Balance is"+bal);
    }
    public void withdraw(float amt) throws LessBal
    {
        float x;
        x=bal-amt;
        if(x>500)
        {
            bal-=amt;
            System.out.println("Balance is "+bal);
        }
        else
        {
            throw new LessBal(x);
        }
    }
}
public class Program5 {
    public static void main(String[] args) {
        try {
            Account ob = new  Account(500);
            ob.deposit(200);
            ob.withdraw(100);
        }
        catch (Exception e)
        { }
    }
}
