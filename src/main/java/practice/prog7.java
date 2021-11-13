package practice;
class square
{
    public void sarea(int a)
    {
        float sa = (4*a);
        System.out.println("Area of sq "+sa);
    }
}
class circle
{
    public void carea(int r)
    {
        double ca = (3.142*r*r);
        System.out.println("Area circle "+ca);
    }
}
public class prog7 {
    public static void main(String[] args) {
        circle c = new circle();
        c.carea(10);
        square s = new square();
        s.sarea(50);
    }
}
