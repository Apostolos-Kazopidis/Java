class Snack extends Food {

    public Snack() {

    }

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
        return new Snack(this.getName(), this.getCalories());
    }

    @Override
    public String toString() {
        return "Snack: " + super.toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack that = (Snack) o;
        return getName().equals(that.getName()) && getCalories() == that.getCalories();
    }

}
