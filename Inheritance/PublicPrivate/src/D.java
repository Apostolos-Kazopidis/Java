class D extends B {
    public void setValues() {
        pub = 1;
        // pri = 2; // doesn't work
        setPriv(2); // ok
        defMod = 3;
    }

    public void print() {
        System.out.println("pu:" + pub + " pr: " + getPriv() + " defMod: " + defMod);
    }
}
