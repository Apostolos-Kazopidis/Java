import java.util.Random;

class Cow {
    String name;
    int weight;
    int hunger;
    String eyes;
    String skin;

    Cow(String name) {
        this.name = name;
    }

    Cow(String name, int weight, int hunger, String eyes, String skin) {
        this(name); //kaleis ton kataskeuasti me to ena orisma (to onoma)
        this.weight = weight;
        this.hunger = hunger;
        this.eyes = eyes;
        this.skin = skin;
    }

    void express() {
        if (hunger > 5)
            System.out.println("Mooooowwwwwwwww");
        else
            System.out.println("Mowwww");
    }

    Cow mate(Cow m, String babyName) {
        Cow baby = new Cow(babyName);
        baby.weight = 50;
        baby.hunger = 10;

        Random r = new Random();
        //Me pithanotita 50% to derma tou mwrou
        // i tha einai
        //to derma tou antikeimenou pou egine h klish ths methodou  (MITERA->MOLLY)
        //h tou antikeimenou pou irthe san orisma (PATERAS->ANGUS)
        if (r.nextInt(2)==0)
            baby.skin = this.skin;
        else
            baby.skin = m.skin;
        if (r.nextInt(2)==0)
            baby.eyes = this.eyes;
        else
            baby.eyes = m.eyes;

        return baby;
    }

}