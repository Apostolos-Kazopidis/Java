class exercise01 {
    public static void main(String[] args) {
        //int[] array = {1,2,3,4,5,6,7,8,9,3};
        int[] array = new int[10];
        int x = 13;
        boolean found = false;

        for(int i=0; i<array.length; i++){
            array[i]=i*2;
            System.out.print(array[i]+" ");

            if(array[i] == x){
                System.out.println("\nVrethike o "+array[i]+" sthn thesi "+i);
                found=true;
                break;
            }
        }

        if(!found){
            System.out.println("\nden vrethike...");
        }

    }
}
