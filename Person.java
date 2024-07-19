public class Person {
    // attributes initialize
    private String name;
    private String address;
    private int number;
    private int phone ;

    // setter and getter generate
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    // constructor generate
    public Person(String name, String address, int number, int phone) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.phone = phone;
    }


}
