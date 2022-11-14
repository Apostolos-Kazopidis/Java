public class Main {
    public static void main(String[] args) {

        Test t = (n1, n2) -> n1>n2;

        System.out.println(t.test(3,2));

        t = (n1, n2) -> n1%2==0 && n2%2==0;

        System.out.println(t.test(2,2));

    }
}