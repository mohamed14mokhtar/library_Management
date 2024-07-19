public class Transaction implements Borrowable{
    // attributes initialize
    private String transaction_type;
    private  int book_id;
    static int transaction_counter;

    // setter and getter generate

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }


    // constructor generate

    public Transaction(String transaction_type, int book_id) {
        this.transaction_type = transaction_type;
        this.book_id = book_id;
        transaction_counter++;
    }

    @Override
    public void borrowItem() {
        System.out.println("book with id is borrowed " + getBook_id());
    }

    @Override
    public void returnItem() {
        System.out.println("book with id is returned " + getBook_id());
    }
}
