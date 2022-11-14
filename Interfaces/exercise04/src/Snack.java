class Snack extends Food {

    public Snack(String name, double calories) {
        super(name, calories);
    }

    @Override
    double eat() {
        System.out.println("I am eating Snack "+ getName());
        return getCalories();
    }

    @Override
    public Object copy() {
        return new Snack(this.getName(), this.getCalories());
    }

    @Override
    public String toString() {
        return "Snack: " + super.toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // px array[0] prin thn teleia isoutai me array[0] pou vazei o xristis san parametro tote epistrefei true
        if (o == null || getClass() != o.getClass()) return false; //an to antikeimeno pou moy irthe apo ejw einai null H getClass (as poume einai to snack) diaforetiko tou o.getClass (tou snack apo ejw) tote kane return false
        Snack that = (Snack) o; //Gia na sygkrinw ta melh prepei na exoume prosbash se auta gia auto allwste kanw auton ton tropo
        return getName().equals(that.getName()) && getCalories() == that.getCalories(); //Sygrkish 2 symboloseirwn-antikeimenwn gia auto vazoume equals enw sto allo 2 primitives gia auto bazoume ==
    }

    /*
     *Το that δεν είναι κάτι συντακτικό για να το βρεις κάπου. Μία μεταβλητή σε αυτόν τον κώδικα έχει απλά ονομαστεί έτσι.
Μην ξεχνάμε τι κάνουμε: θέλουμε να κάνουμε σύγκριση για ισότητα δύο αντικειμένων δικής μας κλάσης (εδώ SampleClass)
Οπότε θα γράφουμε για να συγκρίνουμε τα δύο αντικείμενα (π.χ. ob1, ob2):  ob1.equals(ob2)
Εδώ βλέπουμε την υλοποίηση της μεθόδου αυτής ως μέλος της κλάσης SampleClass.
Όταν κληθεί, όπου this είναι το ob1 και όπου ο είναι το ob2 (o έχει ονομαστεί το όρισμα της μεθόδου)
Γίνονται πρώτα δύο έλεγχοι (αν είναι το ίδιο αντικείμενο ο 1ος, και έπειτα αν το ο είναι null, ή είναι αντικείμενα διαφορετικής κλάσης, με αντίστοιχες επιστροφές τιμών
Στην συνέχεια γίνεται αλλαγή τύπου ώστε το ο να είναι τύπου SampleClass. Εδώ ονομάζει την αναφορά that (αλλά θα μπορούσε να την ονομάσει και όπως αλλιώς θέλει...)
Η ουσία είναι ότι πλέον το ob1 είναι το this, και το ob2 είναι το that, είναι αναφορές σε αντικείμενα τύπου SampleClass και στη συνέχεια μπορούμε να ελέγξουμε με διαφορετικές συγκρίσεις αν αυτά περιέχουν τις ίδιες τιμές στα μέλη τους, ώστε να αποφανθούμε για το αν τα αντικείμενα αυτά είναι ίσα.
     *
     * */
}
