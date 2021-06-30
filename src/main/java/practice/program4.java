package practice;

class a{
    int p=10;

}
class b extends a{
    int q=10;
    void disp()
    {
        System.out.println("Sum= "+(p+1));
    }
}

public class program4 {

    public static void main(String[] args) {
        b ob = new b();
        System.out.println(ob.p);
        ob.disp();
    }

}
