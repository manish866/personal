package practice;

interface First
{
    public  void ClassA();
}
interface Second
{
    public void ClassB();
}
interface Third extends First,Second
{
    public void ClassA();
}
class Fourth implements Third
{
    @Override
    public void ClassA()
    {
        System.out.println("manish");
    }

    @Override
    public void ClassB() {
        System.out.println("Hello");
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        Fourth f = new Fourth();
        f.ClassB();
        f.ClassA();
    }
}
