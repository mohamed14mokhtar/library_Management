public class Member extends Person{
    // attributes initialize
    private int id;

    // setter and getter generate


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // constructor generate

    public Member(String name, String address, int number, int phone, int id) {
        super(name, address, number, phone);
        this.id = id;
    }
}
