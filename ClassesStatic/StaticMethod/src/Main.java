class Main {
    public static void main(String[] args) {
        Humanoid earthen1 = new Humanoid("Bouldercrag the Rockshaper", 10);
        Humanoid earthen2 = new Humanoid("Flint Oremantle", 20);

        System.out.println(earthen1.hit() + " " + earthen2.hit());
        Humanoid.toggleFrenzyMode();
        System.out.println(earthen1.hit() + " " + earthen2.hit());
    }
}
