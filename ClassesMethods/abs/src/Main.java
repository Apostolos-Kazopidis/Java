class Main {
    public static void main(String[] args) {
        Absolute a = new Absolute();
        System.out.println(a.abs(-5));
        System.out.println(a.abs(1.0));
        System.out.println(a.abs(-1L));
        System.out.println(a.abs(-11f));
    }
}
