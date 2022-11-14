public class Main {

    public static void print(Object i, int padding) {

        System.out.println("+"+"-".repeat(padding*2+String.valueOf(i).length())+"+");
        System.out.println("|"+" ".repeat(padding)+i+" ".repeat(padding)+"|");
        System.out.println("+"+"-".repeat(padding*2+String.valueOf(i).length())+"+");
    }


    public static void main(String[] args) {

        print(5,3);
        print("a string",6);
    }
}