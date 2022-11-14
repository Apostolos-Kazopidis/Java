public class MyClass implements Comparable<MyClass> {
    String data;
    int priority;

    public MyClass(String data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    @Override
    public int compareTo(MyClass o) {
        return Integer.compare(priority, o.priority);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "data='" + data + '\'' +
                ", priority=" + priority +
                '}';
    }
}
