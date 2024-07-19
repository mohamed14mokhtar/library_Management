import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ID_BOOK = 0;
        boolean whi =true;
        enum pepole_id {id_1 ,id_2 ,id_3  ,id_4 ,id_5};
        Person number_1=new Person("mohamed ","beni_suef",1,121);
        Person number_2=new Person("ahmed ","beni_suef",2,122);
        Person number_3=new Person("mahmoud ","beni_suef",3,123);
        Person number_4=new Person("mokhtar ","beni_suef",4,124);
        Person number_5=new Person("ali ","beni_suef",5,125);
        Book book_1 =new Book(1,"row","ronaldo");
        Book book_2 =new Book(2,"row","ronaldo");
        Book book_3 =new Book(3,"row","ronaldo");
        Book book_4 =new Book(4,"row","ronaldo");
        Book book_5 =new Book(5,"row","ronaldo");
        while (whi == true){
            System.out.print("please enter your id :");
            int id = sc.nextInt();
            switch (id){
                case 1:
                    System.out.println("hello ms " + number_1.getName());
                    break;
                case 2:
                    System.out.println("hello ms " + number_2.getName());
                    break;
                case 3:
                    System.out.println("hello ms " + number_3.getName());
                    break;
                case 4:
                    System.out.println("hello ms " + number_4.getName());
                    break;
                case 5:
                    System.out.println("hello ms " + number_5.getName());
                    break;
                default:
                    System.out.println("hello ms/mrs ");
            }
            System.out.println("\n");
            System.out.println("What operation do you want to do? ");
            System.out.print("If you want to borrow please inter ( 1 ) : " +
                    "\nIf you want to return please inter ( 2 ) : ");
            int status = sc.nextInt();
            while ((status != 1) && (status != 2)) {
                System.out.print("please enter number (1 or 2) : ");
                status = sc.nextInt();
            }
            System.out.println("\n");
            switch (status){
                case 1:
                    System.out.println("What book ID do you want (1 to 5) :");
                    ID_BOOK =sc.nextInt();
                    while (ID_BOOK < 1 || ID_BOOK > 5) {
                        System.out.print("please enter number (1 or 5) : ");
                        ID_BOOK =sc.nextInt();
                    }
                    Transaction transaction_1 =new Transaction("return",ID_BOOK);
                    transaction_1.borrowItem();
                    break;
                case 2:
                    System.out.println("What is the book ID you are returning?");
                    ID_BOOK =sc.nextInt();
                    while (ID_BOOK < 1 || ID_BOOK > 5) {
                        System.out.print("please enter number (1 or 5) : ");
                        ID_BOOK =sc.nextInt();
                    }
                    Transaction transaction_2 =new Transaction("return",ID_BOOK);
                    transaction_2.returnItem();
                    break;
                default:
            }

            System.out.println("number of transaction today is = " + Transaction.transaction_counter);
            System.out.println("\n");
            if(Transaction.transaction_counter == 5){
                whi = false;
            }
        }
        System.out.println("library is closed now ");
    }
}