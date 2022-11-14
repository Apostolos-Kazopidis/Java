class Main {
    public static void main(String[] args) {
        Cow molly = new Cow("Molly");
        Cow hegge = new Cow("Hegge");
        Farmer bob = new Farmer("Bob");
        bob.milk(molly);
        molly.express();
        bob.milk(hegge);
        hegge.express();
    }
}

