package practice;

class Student
{
    private String name;
    //getter method
    public String getName()
    {
        return name;
    }
    //Setter Method
    public void setName(String name)
    {
        this.name=name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Manish");
        System.out.println(s.getName());
    }
}
