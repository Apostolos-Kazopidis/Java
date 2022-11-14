class arrays2dDiffColSize {
    public static void main(String[] args) {
        int[][] myarray = new int[2][];
        myarray[0]=new int[3];
        myarray[1]=new int[2];

        for (int j=0; j<3; j++)
            myarray[0][j]=10+j;
        for (int j=0; j<2; j++)
            myarray[1][j]=20+j;

        for (int j=0; j<3; j++)
            System.out.print(myarray[0][j] + " ");
        System.out.println("");
        for (int j=0; j<2; j++)
            System.out.print(myarray[1][j] + " ");

    }
}