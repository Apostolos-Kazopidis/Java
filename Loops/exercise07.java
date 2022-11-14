class exercise07 {
    public static void main(String[] args) {

        for (int i=10; i<=20; i+=2)
            System.out.print(i + " ");
        System.out.println("");

        for (int i=19; i>=11; i-=2)
            System.out.print(i + " ");
        System.out.println("");

        for (int i=1; i<=29; i++)
            if (i%2==1 && i%3==0)
                System.out.print(i + " ");
        System.out.println("");

    }
}
