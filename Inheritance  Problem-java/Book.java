public class Book extends LibraryItem {
    private int numberOfPages;
    private String publisher;
    public Book(String title, String author, int itemID, int numberOfPages, String publisher) {
        super(title, author, itemID);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Publisher: " + publisher);
    }
    // Getters and Setters
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public String getPublisher() {
        return publisher;
    }
}

