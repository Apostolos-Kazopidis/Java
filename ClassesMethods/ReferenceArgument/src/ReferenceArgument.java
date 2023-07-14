class ReferenceArgument {
    void chData(Data a) {
        a.x = 5;
        System.out.println(a.x);
    }
    void chRef(Data a) {
        a = new Data();
    }
}
