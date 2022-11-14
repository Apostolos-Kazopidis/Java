public class Main {

    public static void main(String[] args) {
        System.out.printf("|%7.2f|\n", 0.1);
        System.out.printf("|%-+7.2f|\n", 0.1);
        System.out.printf("|%-+(7.2f|\n", -0.1);
        System.out.printf("|%-+(7.2f|\n", 0.1);
    }
}
