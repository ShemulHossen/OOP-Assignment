
public class LibraryItem {
    private String title;
    private String author;
    private int itemID;

    public LibraryItem(String title, String author, int itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Item ID: " + itemID);
    }
    // Getters and Setters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getItemID() {
        return itemID;
    }
}
