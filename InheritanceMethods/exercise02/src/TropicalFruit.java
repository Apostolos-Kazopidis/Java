public class TropicalFruit extends Food{
    private String type;

    TropicalFruit(String name, double calories, String type) {
        super(name,calories);
        this.type =type;
    }

    @Override
    public double eat() {
        System.out.println("Iam eating fruit: "+getName()+" type: "+type);
        return getCalories();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
