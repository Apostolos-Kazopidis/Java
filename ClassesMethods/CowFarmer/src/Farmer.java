class Farmer {
    String name;

    Farmer(String name) {
        this.name = name;
    }

    void milk(Cow c) {
        System.out.println("I milk the cow");
        c.weight-=10;
        System.out.println("Done");
    }
}
