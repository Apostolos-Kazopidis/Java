public class Philosopher {
    String fullName;
    String season;
    String[] books;
    String faculty;

    int nBooks;

    Philosopher(){
        books = new String[5];
        nBooks = 0;
    }

    void print(){
        System.out.println("fullName: "+fullName);
        System.out.println("season: "+season);
        System.out.println("books: "+nBooks);
        for(int i=0; i<nBooks; i++){
            System.out.print(books[i]+" ");
        }
        System.out.println();
        System.out.println("faculty: "+faculty);
    }

}























