public interface MyInterface {
    //int ix; //variable POU DEN MPOREIS NA VALEIS EDW
    int ix = 0; //static constant-statikh stathera
    final double PI =3.14159; //static constant-statikh stathera
    //static int lol; //statikh metabliti den ginetai
    static int sx =2;//statikh stathera


    //method-methodos MONO AN VALOUME THN LEJH default BROSTA
    default void iif() {

    }

    //static method
    static void ig() {

    }

    void ih(); //abstract method

}
