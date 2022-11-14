import java.util.Scanner;

abstract class Food implements StandardMethods, DoubleAdjustments {
    private String name;
    private double calories;

    public Food() {

    }

    public Food(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public void doubleEverything() {
        calories = calories * 2;
    }

    @Override
    public void halfEverything() {
        calories = calories / 2;
    }

    abstract double eat();

    public void read(Scanner sc) {
        System.out.println("Give me a food name: ");
        this.name = sc.nextLine();

        while(true) {
            System.out.println("Give me the calories of the food: ");
            if (sc.hasNextDouble()) {
                this.calories = sc.nextDouble();
                break;
            } else {
                System.out.println("ERROR....use a a double please.....");
                sc.next(); //to diabazoume jexwrista kai petame sta skoupidia thn lathos eisagogi px an ebaze (string)
            }
        }

        sc.nextLine(); //gnorizw oti exei meinei mesa ena /n opote to double OPOTE MONADIKH LYSH GIA NA TO YPERBW
                       //oles oi next kratane mesa skoupidia ektos apo thn nextLine
    }

}
















