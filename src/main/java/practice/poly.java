package practice;

public class poly {

    public int Poly(int x, int y) {
        return x + y;
    }
    public int Poly(int x,int y,int z)
    {
        return x+y+z;
    }
    poly()
    {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        poly p = new poly();
        System.out.println(p.Poly(10,20));
        System.out.println(p.Poly(10,30,30));

    }
}
