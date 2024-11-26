import java.util.ArrayList;
public class Library {
    private ArrayList<LibraryItem> items;
    public Library() {
        items = new ArrayList<>();
    }
    public void addItem(LibraryItem item) {
        items.add(item);
    }
    public void removeItem(int itemID) {
        items.removeIf(item -> item.getItemID() == itemID);
    }
    public void displayItems() {
        for (LibraryItem item : items) {
            item.display();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1, 180, "Scribner");
        Journal journal1 = new Journal("Nature", "Various Authors", 2, 42, "2023-06-25");
        library.addItem(book1);
        library.addItem(journal1);
        library.displayItems();
        library.removeItem(1);
        library.displayItems();
    }
}

