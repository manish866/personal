package practice;
import java.util.Scanner;
interface area
{
    public void AreaRec();
    public void Areatri();
}
class measure
{
    int l,b,h;
    public void setTri(int base,int height)
    {
        b=base;
        h=height;
    }
    public void setRec(int len,int height)
    {
        l=len;
        h=height;
    }
}
class calc extends measure implements area
{
    @Override
    public void AreaRec() {
        System.out.println("Area Triangle ="+(0.5*b*h));
    }@Override
    public void Areatri() {
        System.out.println("Area of Rectangle="+(l*h));
    }
}
public class Prog4_2 {
    public static void main(String[] args) {
        calc c = new calc();Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for length,height, base");
        int l=sc.nextInt();
        int h=sc.nextInt();
        int b=sc.nextInt();
        c.setTri(l,h);
        c.setRec(b,h);
        c.AreaRec();
        c.Areatri();
    }
}
