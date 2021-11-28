package practice;

class FirstName
{
    public void First()
    {
        System.out.println("Manish");
    }
}
class LastName extends FirstName
{
    public void Last()
    {
        System.out.println("Dongarekar");
    }

}

public class single_inheritance {
    public static void main(String[] args) {
        LastName ln = new LastName();
        ln.First();
        ln.Last();
    }
}
