public class Journal extends LibraryItem {
    private int volumeNumber;
    private String publicationDate;

    public Journal(String title, String author, int itemID, int volumeNumber, String publicationDate) {
        super(title, author, itemID);
        this.volumeNumber = volumeNumber;
        this.publicationDate = publicationDate;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Volume Number: " + volumeNumber);
        System.out.println("Publication Date: " + publicationDate);
    }
    // Getters and Setters
    public int getVolumeNumber() {
        return volumeNumber;
    }
    public String getPublicationDate() {
        return publicationDate;
    }
}

