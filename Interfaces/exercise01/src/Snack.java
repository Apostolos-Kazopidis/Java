class Snack extends Food {

    public Snack(String name, double calories) {
        super(name, calories);
    }

    @Override
    double eat() {
        System.out.println("I am eating Snack "+ getName());
        return getCalories();
    }

    @Override
    public Object copy() {
        return new Snack(this.getName(),this.getCalories());
    }

    @Override
    public String toString() {
        return "Snack: " + super.toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
