class Storey {
    //o orofos exei diamerismata
    private Flat[] flats; //kataskeuh anaforas

    Storey(int cFlats) {
        flats = new Flat[cFlats]; //ftiajimo pinaka apo anafores
        for(int i=0; i<flats.length; i++)
            flats[i]= new Flat(); //desmeusi xwrou gia kathena apo ta antikeimena
    }

    //theloume na prosthesoume anrthropous se ena diamerisma
    public void addPeople(int flat, int people) {
        flats[flat].addPeople(people);
    }

    public void printPeople() {
        for(int i=0; i< flats.length; i++) {
            System.out.println("\tFlat "+i+": "+flats[i].getPeople());
        }
    }
}
