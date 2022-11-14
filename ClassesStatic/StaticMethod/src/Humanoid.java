class Humanoid {
    private static boolean frenzyMode = false;
    private String name;
    private int maxDamage;

    Humanoid(String name, int maxDamage) {
        this.name = name;
        this.maxDamage = maxDamage;
    }

    public static void toggleFrenzyMode() {
        frenzyMode = !frenzyMode;
    }

    public int hit() {
        return maxDamage * (frenzyMode? 10 : 1);
    }

}
