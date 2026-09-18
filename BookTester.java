public class BookTester {
    public static void main(String[] args){
        Book book1 = new Book("One of a kind", "-500");
        Book book2 = new Book("The Heart of the Betrayed", "-400");

        System.out.println(book1);
        System.out.println(book2);

        Book[] books = new Book[4];

        books[0] = book1;
        books[1] = book2;

        for (int i = 0; i < 2; i++){
            System.out.println(books[i]);
        }
    }
}
