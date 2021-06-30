package practice;

class prog2 {
    public void disp() {
        System.out.println("This is outer class");
    }

    static class B extends prog2 {
        protected void innerdisp() {
            super.disp();
        }
    }


    public static void main(String[] args) {
        B ob = new B();
        ob.innerdisp();
    }

}