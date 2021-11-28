package practice;

class one
{
    public void First()
    {
        System.out.println("FirstClass");
    }
}
class two extends one
{
    public void Second()
    {
        System.out.println("SecondClass");
    }
}
class three extends two
{
    public void Third()
    {
        System.out.println("ThirdClass");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        three t = new three();
        t.Third();
        t.Second();
        t.First();
    }
}
