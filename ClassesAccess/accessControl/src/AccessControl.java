class AccessControl {
    private int priVar = 1;
    public int pubVar = 0;

    private void priMethod() {
        System.out.println("priMethod: " + priVar + " " +pubVar);
    }

    public void pubMethod() {
        System.out.println("pubMethod: " + priVar + " " +pubVar);
        priMethod();
    }
}
