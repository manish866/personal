package practice;

public class program1 {
    program1(){
        System.out.println("Construcor invoked");
    }
    program1(int i){
        i++;
        System.out.println(i);
    }
    public void fun(){
        System.out.println("Fuction invoked");
    }
    public void fun(int j){
        System.out.println(++j);
    }
    public static void main(String[] args) {
        program1 p1 = new program1();
        program1 p2 = new program1(10);
        p1.fun();
        p1.fun(20);

    }
}
