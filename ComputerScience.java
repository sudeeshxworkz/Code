class ComputerScience {
    public static void main(String[] comp) {
        Book book = new Book();
        book.setBookTitle("Java Programming");
        book.setAuthor("John Doe");
        book.setPrice(289.99);

        System.out.println("Book Title: " + book.getBookTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
    }
}