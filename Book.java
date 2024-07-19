public class Book extends Item{
    // attributes initialize
    private String author;

    // setter and getter generate


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // constructor generate
    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public void book_id(){
        System.out.println("Book ID: " + this.getId());
    }
}
