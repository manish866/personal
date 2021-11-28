package practice;

class Parent {
     protected void show()
    {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {

    protected void show()
    {
        System.out.println("Child's show()");
    }
}

public class overriding {
    public static void main(String[] args) {
    Parent o = new Parent();
    o.show();
    Parent o1 = new Child();
    o1.show();
    }
}
