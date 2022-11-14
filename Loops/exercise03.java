class exercise03 {
    public static void main(String[] args) {
        char c;

        c=0;
        while(c<=10000) {
            System.out.print(c);

            if (c%200==0)
                System.out.println("");
            c++;
        }
    }
}
