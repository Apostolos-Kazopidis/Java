public class Main {
    public static void main(String[] args) {
        Food[] array = new Food[8];

        array[0] = new Snack("protein bar",100);
        array[1] = new TropicalFruit("mango",102,"fruitonian");
        array[2] = new TropicalFruit("apple",103,"fruitonian");
        array[3] = new TropicalFruit("banana",104,"fruitonian");
        array[4] = new TropicalFruit("ornage",200,"fruitonian");
        array[5] = new Snack("chocolate",22);
        array[6] = new Snack("doritos",211);
        array[7] = new Snack("rice cake",213);

        double sum = 0.0;
        for(var x: array) {
            sum+=x.eat();
        }

        System.out.println("Total Calories: "+sum);



    }
}