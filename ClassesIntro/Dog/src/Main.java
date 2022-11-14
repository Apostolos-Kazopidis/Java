public class Main {
    public static void main(String[] args) {

        Dog piko = new Dog();
        piko.name = "Piko";

        Dog lassie = new Dog();
        lassie.name = "Lassie";
        lassie.weight = 30;
        lassie.breed = "Colley";

        System.out.println("Name: "+lassie.name+" Weight: "+lassie.weight+" Breed: "+lassie.breed);
    }
}