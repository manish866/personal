package practice;

class Base
{
    public void BaseClassMethod()
    {
        System.out.println("BaseClassMethod");
    }
}
class Derived1 extends Base
{
    public void Derived1Method()
    {
        System.out.println("Derived1Method");
    }
}
class Derived2 extends Base
{
    public void Derived2Method()
    {
        System.out.println("Derived2Method");
    }
}

class Derived3 extends Base
{
    public void Derived3Method()
    {
        System.out.println("Derived3Method");
    }
}

public class Hierachical_Inheritance {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1();
        d1.BaseClassMethod();
        d1.Derived1Method();

        Derived2 d2 = new Derived2();
        d2.BaseClassMethod();
        d2.Derived2Method();

        Derived3 d3 = new Derived3();
        d3.BaseClassMethod();
        d3.Derived3Method();
    }
}
