class Main {
    public static void main(String[] args) {
        Data d = new Data();
        ReferenceArgument r = new ReferenceArgument();
        System.out.println(d.x);
        r.chData(d);
        System.out.println(d.x);
        r.chRef(d);
        System.out.println(d.x);
    }
}
