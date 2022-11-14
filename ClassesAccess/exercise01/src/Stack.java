public class Stack {
    private final int SIZE =10;
    private int[] array;
    private int top;

    Stack(){
        array = new int[SIZE];
        top = -1; //symbolizei oti h stoiva mas einai adeia
                  //AN JEKINOUSA APO TO 0 THA SIMENE OTI H STOIVA EXEI ENA STOIXEIO MESA HDH
    }

    public void push(int value) {
        //SIZE-1 GT JEKINAS APO 0->9 SKEPSOU THESI 8 KANEIS PUSH FTANEIS 9
        //PREPEI NA VRISKESAI SIZE -1 GIA NA KANEIS PUSH
        //ALLIWS PROBLIMA
        if(top<SIZE-1) { //oso to top DEN EINAI GEMATO diladi einai adeio
            top++; //aujise kata 1
            array[top]=value; //vale ston pinaka mesa to stoixeio
                              //array[top] AKRIVWS TO IDIO ME array[i]
        }
        else {
            System.out.println("H stoiva einai gemath.....");
        }
    }

    public int pop(){
        if(top>=0) { //OSO TO TOP EXEI MESA STOIXEIA DILADI EINAI GEMATO TOTE....
            top--; //vgale mou to teleutaio stoixeio
            return array[top + 1]; //kane mou epistrofi to stoixeio pou vgike
                                   // gia auto allwste kai top +1
        }
        else {
            System.out.println("H stoiva einai adeia......");
            return -1; //mpakalikh gia thn epistrofh KANONIKA PRPEPEI EXCEPTION sygkekrimena to throw!!!
        }
    }

    public boolean empty(){
        if (top==-1)
            return true;
        else
            return false;
    }

    /*
    public boolean empty(){
        return top==-1; //epistrei true alliws FALSE
    * */


}
