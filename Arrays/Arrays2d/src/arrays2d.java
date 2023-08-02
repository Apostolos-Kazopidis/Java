class arrays2d {
    public static void main(String[] args) {
        int N = 5, M = 6;
        int[][] myarray = new int[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                myarray[i][j] = i + j;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(myarray[i][j] + " ");
            System.out.println("");
        }
    }
}
