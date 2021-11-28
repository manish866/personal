package practice;
class adder{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return  a+b+c;
    }
}
public class overloading {
    public static void main(String[] args) {
        System.out.println(adder.add(10,2));
        System.out.println(adder.add(10, 20, 30));
    }
}
