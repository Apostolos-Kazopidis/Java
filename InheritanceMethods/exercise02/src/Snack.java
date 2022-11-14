public class Snack extends Food{
    Snack(String name, double calories) {
        super(name,calories);
    }

    @Override
    public double eat() {
        System.out.println("I am eating snack: "+getName());
        return getCalories();
    }
}
