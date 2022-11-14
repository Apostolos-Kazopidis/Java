class arrays {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] myArray = new int[5];
        for (int i=0; i<5; i++)
            myArray[i]=i*i;
        for (int i=0; i<5; i++)
            System.out.println(myArray[i]);
        for(int i=0; i<4; i++)
            System.out.println(array[i]);
    }
}
