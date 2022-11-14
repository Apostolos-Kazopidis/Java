class MyException extends RuntimeException {
    private int val;
    MyException(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "MyException(" + "val=" + val + ')';
    }
}
