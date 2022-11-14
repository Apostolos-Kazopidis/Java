public class Main {

    public static void main(String[] args) {

        Cow molly = new Cow("Molly", 500, 10, "blue", "brown");
        Cow angus = new Cow("Angus", 600, 7, "black", "white");
        Cow baby = molly.mate(angus, "Clarabelle");
        System.out.println("Baby " + baby.name + " has " + baby.eyes + " eyes, and " + baby.skin + " skin. ");

    }
}

