package practice;

//public class program6 extends Thread{
//    public static void main(String[] args) {
//        program6 op = new program6();
//        op.start();
//        System.out.println("Manish");
//    }
//    public void run()
//    {
//        System.out.println("Thread is running");
//    }
//}
public class program6 implements Runnable
{
    public static void main(String[] args)
    {
        program6 op = new program6();
        Thread th = new Thread(op);
        th.start();
        System.out.println("Manish");
    }
    public void run()
    {
        System.out.println("The running tread");
    }
}
