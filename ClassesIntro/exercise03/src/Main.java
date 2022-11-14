public class Main {
    public static void main(String[] args) {
        Philosopher plato = new Philosopher();
        plato.fullName = "Platon";
        plato.season = "Ancient Greece";
        plato.books[0] = "The Republic";
        plato.books[1] = "Phaedon";
        plato.nBooks = 2;
        plato.faculty = "Platonism";

        plato.print();

    }
}