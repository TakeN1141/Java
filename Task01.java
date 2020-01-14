import java.awt.print.Book;
import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args){

    class Library {
        public String name;
        public ArrayList<Book> books = new ArrayList<>();

        public Library(String name) {
            this.name = name;
        }

        void addBook(Book book) {
            books.add(book);
        }
        public String getAllBooks(){
            String toReturn = " ";
            for(Book book : books){
                toReturn = toReturn+ book.getNumberOfPages();
            }
            return toReturn;
        }
    }
    class Book {

        String titleofbook = new String();
        String autor = new String();
        String publishinghouse = new String();
        String yearofpublishing = new String();
        String ISBN = new String();

    }

}/*end of main*/

}/*end of public class*/