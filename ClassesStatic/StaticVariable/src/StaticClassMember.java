class StaticClassMember {
    static int sVar = 0;
    int x;

    StaticClassMember(int x) {
        this.x = x;
    }

    void inc() {
        sVar++;
    }

    void dec() {
        sVar--;
    }
}
