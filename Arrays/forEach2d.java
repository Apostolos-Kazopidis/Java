class forEach2d {
    public static void main(String[] args) {
        int[][] myArray = {{1, 2}, {3, 4}};

        for(int[] row: myArray)
            for(int elem: row)
                System.out.println(elem+" ");



    }
}
