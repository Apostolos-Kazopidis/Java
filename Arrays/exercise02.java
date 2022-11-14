class exercise02 {
    public static void main(String[] args) {

        int[][] array = new int[4][3];
        //int[][] array = {{1,8,3}, {1,4,6}, {7,3,9}, {2,3,5}};
        int sum;

        System.out.println("Pinakas: ");
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                array[i][j]=i+j;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("----------------------");
        for(int i=0; i<4; i++){
            sum=0;
            for(int j=0; j<3; j++){
                sum = sum + array[i][j];
            }
            System.out.println(i +"i grammi: " + sum);
        }

        System.out.println("----------------------");
        for(int i=0; i<4; i++){
            sum=0;
            for(int j=0; j<3; j++){
                sum = sum + array[i][j];
            }
            System.out.println(i +"i stili: " + sum);
        }


    }
}
