class Cow {
    String name;
    int weight;
    int hunger;

    Cow(String name) {
        this.name = name;
        weight = 500;
        hunger = 10;
    }

    Cow(String name, int weight, int hunger) {
        this.name = name;
        this.weight = weight;
        this.hunger = hunger;
    }

    void express() {
        if (hunger > 5)
            System.out.println("Mooooowwwwwwwww");
        else
            System.out.println("Mowwww");
    }

}