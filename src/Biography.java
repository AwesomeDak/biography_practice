import java.util.ArrayList;
import java.util.Scanner;
public class Biography {

    public static void main(String[] args) {
        /*
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
        This will be our actual program that we define author and his books
        In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

        Full name = Stefan Zweig
        County = Austria
        Is still alive: No (28 November 1881 – 22 February 1942)
        Some of his books as listed below:

        BookName                            Genre           TotalPage
        Amok                                tale            189
        The Royal Game                      novella         53
        24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your favorite author’s first name? ");
        String firstName = scanner.nextLine();

        System.out.print("What is your favorite author’s last name? ");
        String lastName = scanner.nextLine();

        System.out.print("Where is your favorite author from? ");
        String country = scanner.nextLine();

        System.out.print("Is your favorite author alive? Y/N ");
        String alive = scanner.nextLine();

        boolean isAlive = alive.equalsIgnoreCase("Y");

        int age = 0;
        if (isAlive) {
            System.out.print("How old is your favorite author? ");
            age = scanner.nextInt();
        }

        Author author = new Author(firstName, lastName, country, isAlive, age);

        ArrayList<Book> books = new ArrayList<>();

        System.out.print("Would you like to enter book information? (Y/N) ");
        String input = scanner.next();

        while (input.equalsIgnoreCase("Y")) {
            System.out.print("What is the book name? ");
            String name = scanner.next();
            scanner.nextLine();

            System.out.print("What is genre of the book? ");
            String genre = scanner.next();
            scanner.nextLine();

            System.out.print("How many pages does book have? ");
            int pages = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(name, genre, pages);
            books.add(book);

            System.out.print("Would you like to enter book information? (Y/N) ");
            input = scanner.next();
            scanner.nextLine();
        }


        System.out.println("Author's information = " + author);
        System.out.println("Author's books are as listed below:");
        for (Book book : books) {
            System.out.println(book.toString());
        }

    }
}
