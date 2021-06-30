package practice;
class shop
{
    private static int matirial;
    private boolean availabe=false;
    public synchronized void put(int value)
    {
        while (availabe==true)
        {
            try {
                wait();
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        matirial=value;
        availabe=true;
        notifyAll();
        System.out.println("Product Value = " + matirial);
    }
    public synchronized void get()
    {
        while (availabe==false)
        {
            try {
                wait();
            }
            catch (InterruptedException ie)
            {

            }
        }
        availabe=false;
        notifyAll();
        System.out.println("Consumed Value = "+matirial);
    }
}
class produce extends Thread
{
    private shop s;
    public produce(shop c)
    {
        s=c;
    }
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            s.put(i);
        }
    }
}
class consumer extends Thread
{
    private shop s;
    public consumer(shop c)
    {
        s=c;
    }
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            s.get();
        }
    }
}
public class Prog6  {
    public static void main(String[] args) {
        shop s = new shop();
        produce p1 = new produce(s);
        consumer c1 = new consumer(s);
        p1.start();
        c1.start();
    }
}
