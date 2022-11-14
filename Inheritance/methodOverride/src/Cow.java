class Cow {
    private int weight;
    private int hunger;

    Cow(int weight, int hunger) {
        this.weight = weight;
        this.hunger = hunger;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void express() {
        if (hunger > 5)
            System.out.println("Moooooooooooowwwwwwww");
        else
            System.out.println("Moooww");
    }
}
