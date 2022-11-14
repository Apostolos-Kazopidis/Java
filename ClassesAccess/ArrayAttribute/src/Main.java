import java.util.Random;

class Main {

    public static void main(String[] args) {
        Grades g = new Grades(5);
        Random r = new Random();

        for (int i=0; i<5; i++)
            g.setGrade(i,r.nextInt(11));

        g.print();
    }
}
