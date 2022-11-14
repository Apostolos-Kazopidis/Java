class Main {
    public static void main(String[] args) {
        SClass s = new SClass();
        s.g();

        //(new SClass()).g();
        //Idios tropos aplos epeidh den yparxei anafora antikeimenou
        //sto telos tha to mazepsei o garbage collector

        System.out.println(StatInterface.f());
    }
}
