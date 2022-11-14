public class Main {
    public static void main(String[] args) {
        AccessControl a = new AccessControl();
        a.pubVar = 5;
        // a.priVar = 10; // doesn't work
        a.pubMethod();
        // a.priMethod(); // doesn't work
    }
}
