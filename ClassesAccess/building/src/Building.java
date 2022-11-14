class Building {
    Storey[] storeys;
    Building(int cStoreys) {
        storeys = new Storey[cStoreys];
        for (int i=0; i<cStoreys; i++)
            storeys[i]=new Storey();
    }

    void addPeople(int storey, int people) {
        //storeys[storey].people += people;
        storeys[storey].addPeople(people);
    }

    void printPeople() {
        for (int i=0; i<storeys.length; i++)
            System.out.println("Storey " + i + ": " +
            storeys[i].people + " people");
    }
}

