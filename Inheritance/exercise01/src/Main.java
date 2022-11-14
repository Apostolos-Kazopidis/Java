public class Main {
    public static void main(String[] args) {
        Horse horse1 = new Horse(34,1,"Brown",1);
        System.out.println("To xrwma tou alogou einai: "+horse1.getColor());

        Doberman doberman1 = new Doberman(21,3,54);
        doberman1.bark();
        doberman1.run();
        doberman1.bark();

        Bulldog bulldog1 = new Bulldog(234,45,321,3);
        bulldog1.bark();
        bulldog1.sleep();
        bulldog1.sleep();
    }
}