import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> listOfBooks;

    public Library() {
        this.listOfBooks = new ArrayList<>();
    }
    public void addBook(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("title of book");
        String titleOfBook = scanner.nextLine();

        System.out.println("name of author");
        String nameOfAuthor = scanner.nextLine();

        System.out.println("year of book");
        int yearOfBook = scanner.nextInt();

        listOfBooks.add(new Book(titleOfBook,nameOfAuthor, yearOfBook ));
        System.out.println("your book have added");
    }
    public void showAllBooks(){
        System.out.println(listOfBooks);
    }
    public void removeBook(){
        System.out.println("write book title");
        Scanner scanner = new Scanner(System.in);
        String deletedBookTitle = scanner.nextLine();
        for(int i=0; i < listOfBooks.size(); i++){
            if(deletedBookTitle.equals(listOfBooks.get(i).getTitle())){
                listOfBooks.remove(i);
                System.out.println("book removed");
                System.out.println(listOfBooks);
            }
        }
    }
}

class Book {
   private String title;
   private String  author;
   private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}