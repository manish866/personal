package practice;

abstract class name
{
    abstract void run();
}
class student extends name
{
    @Override
    void run() {
        System.out.println("Manish");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        student s = new student();
        s.run();
    }
}
