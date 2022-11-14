import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Eisage arithmo apo to 1...4");
            x = sc.nextInt();
            if (x==1) {
                int y;
                System.out.println("Dose mou enan arithmo gia na brw to tetragwno toy:");
                y = sc.nextInt();
                System.out.println("Tetragwnw toy y:"+y+" einai to "+y*y);
                break;
            } else if (x==2) {
                Main.print();
                break;
            } else if (x==3) {
                float z;
                System.out.println("Dwse mou mia float timh: ");
                z=sc.nextFloat();
                System.out.printf("To 1/4 tou arithmou: %.4f einai to %.4f",z,z/4);
                break;
            } else if (x==4) {
                Main.arrayManip();
                break;
            } else {
                System.out.println("ERROR...PREPEI NA VALEIS ARITHMO METAJH 1 KAI 4");
            }

        }
        sc.close();
    }

    public static void print() {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Vale enan akeraio arithmo: ");
        N = sc.nextInt();

        for(int i=0; i<N; i++) {
            System.out.println("Kalimera");
        }
    }

    public static void arrayManip() {
        Scanner sc = new Scanner(System.in);
        int N=5;
        double sum=0;
        double[] array = new double[N];

        System.out.println("Dwse arithmous gia ypologismo mesou orou: ");
        for(int i=0; i<N; i++) {
            array[i] = sc.nextDouble();
            sum+=array[i];
        }
        System.out.println("Mesos oros: "+sum/N);
    }
}

















