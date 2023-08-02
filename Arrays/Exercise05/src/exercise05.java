import java.util.Random;

public class exercise05 {
    public static void main(String[] args) {
        int N= 10, M = 4, L = 9;
        int[][][] array = new int[N][M][L];
        int x = 2560;
        boolean found = false;

        Random r = new Random();

        outer: for(var i=0; i < N; i++){
            for(var j=0; j < M; j++){
                for(var k=0; k < L; k++){
                    array[i][j][k]=r.nextInt(5001);
                    System.out.print(array[i][j][k]+" ");

                    if(array[i][j][k] == x){
                        System.out.println("\nVrethike to stoixeio "+x);
                        found = true;
                        break outer;
                    }

                }
                System.out.println();
            }
            System.out.println("\n");
        }

        if(!found){
            System.out.println("Den vrethike to stoixeio "+x);
        }

    }
}
