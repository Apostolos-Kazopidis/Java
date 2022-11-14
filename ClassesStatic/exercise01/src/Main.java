public class Main {
    public static void main(String[] args) {
        Cycle cycle = new Cycle(3,"cm");
        System.out.println("H perimetros se ekatosta einai: "+cycle.perimeterCm());
        System.out.println("H perimetros se inches einai: "+cycle.perimeterIn());
    }
}