class TropicalFruit extends Food {
    String type;

    public TropicalFruit(String name, double calories, String type) {
        super(name, calories);
        this.type = type;
    }

    @Override
    double eat() {
        System.out.println("I am eating fruit "+ getName() + "(" + type + ")");
        return getCalories();
    }

    @Override
    public Object copy() {
        return new TropicalFruit(this.getName(),this.getCalories(),this.type);
    }

    @Override
    public String toString() {
        return "TropicalFruit{" +
                "type='" + type + '\'' +
                '}' +super.toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
