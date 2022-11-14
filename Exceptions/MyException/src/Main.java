public class Main {

    public static void main(String[] args) {
        try {
            throw new MyException(1);
        } catch(MyException ob) {
            System.out.println(ob);
        }
    }
}
