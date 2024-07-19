public abstract class Item {
    // attributes initialize
    private int id;
    private String title;

    // setter and getter generate

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // constructor generate

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // abstract object
    public abstract void book_id();

}
