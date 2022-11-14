public class Main {
    public static void main(String[] args) {
        int N = 5;
        Person[] array = new Person[N];

        array[0] = new Person("Daniel Day Lewis",1014.14);
        array[1] = new Person("Jeremy Irons",488.09);
        array[2] = new Person("Anthony Hopkins",12.13);
        array[3] = new Person("Al Pacino",134.09);
        array[4] = new Person("Tom Hanks",1313.19);

        System.out.printf("+");
        for (int i=1; i<=3; i++) System.out.printf("-");
        System.out.printf("+");
        for (int i=1; i<=20; i++) System.out.printf("-");
        System.out.printf("+");
        for (int i=1; i<=9; i++) System.out.printf("-");
        System.out.printf("+");

        for (int i=0; i<N; i++) {
            System.out.printf("\n| %d |%-19s | %8s|",i+1,array[i].getFullName(),array[i].getSalary());
        }


        System.out.printf("\n+");
        for (int i=1; i<=3; i++) System.out.printf("-");
        System.out.printf("+");
        for (int i=1; i<=20; i++) System.out.printf("-");
        System.out.printf("+");
        for (int i=1; i<=9; i++) System.out.printf("-");
        System.out.printf("+");



    }
}