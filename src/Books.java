public class Books {

        private String title;
        private String author;
        private boolean available;
        private String description;


    public Books(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.available = true; // automatiskt tillgänglig vid skapande.
        this.description = description;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
