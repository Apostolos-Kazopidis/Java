class typeInferenceFor {
    public static void main(String[] args) {
        int[] myArrayInt = {1, 2, 3, 4};
        for (var i=0; i<4; i++)
            System.out.println(myArrayInt[i]);

        for (var v=0.0; v<1.0; v+=0.1)
            System.out.println(v);
    }
}
