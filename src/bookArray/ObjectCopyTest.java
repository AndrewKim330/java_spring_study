package bookArray;

public class ObjectCopyTest {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        System.out.println("original\n");
        for (Book book: library) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("\n");

        System.out.println("copied");
        for (Book book: copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("\n");

        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        System.out.println("copied_modify");
        for (Book book: copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("\n");

        Book[] copyLibrary1 = new Book[5];
        copyLibrary1[0] = new Book();
        copyLibrary1[1] = new Book();
        copyLibrary1[2] = new Book();
        copyLibrary1[3] = new Book();
        copyLibrary1[4] = new Book();

        for (int i = 0; i < copyLibrary1.length; i++) {
            copyLibrary1[i].setTitle(library[i].getTitle());
            copyLibrary1[i].setAuthor(library[i].getAuthor());
        }

        library[0].setAuthor("aaa");
        library[0].setTitle("bbb");

        System.out.println("shallow\n");
        for (Book book: library) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("\n");

        System.out.println("deep");
        for (Book book: copyLibrary1) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("\n");

    }
}
