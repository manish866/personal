package DS;

public class Stack {
    private int arr[],top,capacity;

    Stack (int size)
    {
        arr = new int[size];
        top=-1;
        capacity=size;
    }
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            System.exit(1);
        }
        System.out.println("Inserting "+x );
        arr[++top]=x;
    }
    public Boolean isFull()
    {
        return top == capacity-1;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        System.out.println("Popped element is "+arr[top]);
        return arr[top--];
    }
    public Boolean isEmpty()
    {
        return top==-1;
    }
    public int size()
    {
        return top+1;
    }
    public void printStack()
    {
        for(int i=0;i<=top;i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.pop();
        st.printStack();

    }


}
