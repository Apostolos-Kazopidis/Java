class typeInferenceForEach {
    public static void main(String[] args) {
        int[] myArrayInt = {1, 2, 3, 4};
        for (var elem: myArrayInt)
            System.out.println(elem);

        int[][] myArray = {{1, 2}, {3, 4}};
        for (var row: myArray)
            for(var elem: row)
                System.out.println(elem + " ");
    }
}
