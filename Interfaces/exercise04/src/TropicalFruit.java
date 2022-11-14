class TropicalFruit extends Food {
    String type;

    public TropicalFruit(String name, double calories, String type) {
        super(name, calories);
        this.type = type;
    }

    @Override
    double eat() {
        System.out.println("I am eating Snack "+ getName() + "(" + type + ")");
        return getCalories();
    }

    @Override
    public Object copy() {
        return new TropicalFruit(this.getName(), this.getCalories(), this.type);
    }

    @Override
    public String toString() {
        return "TropicalFruit{" +
                "type='" + type + '\'' +
                '}' + super.toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    /*
    * System.out.println(array[0].equals(o));
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TropicalFruit that = (TropicalFruit) o;
        return getName().equals(that.getName()) && getCalories()==that.getCalories() && type.equals(that.type);
    }
}
