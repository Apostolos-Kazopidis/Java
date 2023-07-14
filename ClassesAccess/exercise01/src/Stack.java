public class Stack {
    private final int SIZE =10;
    private int[] array;
    private int top;

    Stack(){
        array = new int[SIZE];
        top = -1;
    }

    public void push(int value) {
        if(top<SIZE-1) { 
            top++;
            array[top]=value;
        }
        else {
            System.out.println("Stack is fuil.....");
        }
    }

    public int pop(){
        if(top>=0) {
            top--;
            return array[top + 1];
        }
        else {
            System.out.println("Stack is empty.....");
            return -1;
        }
    }

    public boolean empty(){
        if (top==-1)
            return true;
        else
            return false;
    }

    /*
    public boolean empty(){
        return top==-1;
    * */


}
