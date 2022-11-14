class Main {

    public static void main(String[] args) {
        Cow molly = new Cow(500, 10);
        molly.express();

        TexasLonghornCow bob = new TexasLonghornCow(400, 4, 0.50);
        bob.express();
        System.out.println("Bob's horns are " + bob.getHornLength() + " meters long");
        System.out.println("Bob's weight=" + bob.getWeight() + ", hunger=" + bob.getHunger() +
                ", horn_length= "+ bob.getHornLength());
    }
}
