class MyData implements StandardMethods {
    int id;
    int value;

    MyData() {
        id = 0;
        value = 0;
    }

    @Override
    public Object copy() {
        MyData d = new MyData();
        d.id = id;
        d.value = value;
        return d;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "MyData{" +
                "id=" + id +
                ", data='" + value + '\'' +
                '}';
    }
}
