class VarArgs {
    int sum(int ... varargs) {
        int s = 0;

        for (int elem: varargs)
            s+=elem;

        return s;
    }
}
