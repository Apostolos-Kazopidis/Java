class Main {
    public static void main(String[] args) {
        final int SIZE = 5;
        
        BankAccount[] array = new BankAccount[SIZE];

        array[0]=new BankAccount("AposKaz","5566544",500.0,5);
        array[1]=new BankAccount("MitsoLar","524154",600.0,6);
        array[2]=new BankAccount("SakisR","4251425",660.0,55);
        array[3]=new BankAccount("RoulaKok","4215124",100.0,2);
        array[4]=new BankAccount("Minases","42512",570.0,45);

        double max = -1;
        BankAccount m = null;
        for(var account: array){
            if(account.getBalance()>max) {
                max = account.getBalance();
                m = account;
            }
        }

        m.print();
















        /*
        BankAccount ba = new BankAccount("Apostolos Kazopidis","312-3456-2134",500.0,4);
        ba.print();
        System.out.println();
        ba.setFullName("Xristos Ferentinos");
        ba.print();
        System.out.println();
        ba.setAccountYearsOpen(6);
        ba.print();
        */


    }
}
