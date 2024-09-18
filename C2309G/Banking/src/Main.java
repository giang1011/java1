import Entity.Customer;
import java.util.Scanner;
public class Main {
    private static int currentId = 0;
    public static void main(String[] args) {
        //Customer customer = new Customer();
        //Customer customer1 = new Customer(1, "MrBean");
        //Change name
        //customer1.setName("Bill Gate");
        //customer1.name = "Bean";

//        System.out.println("Id: " + customer1.getId()
//                + "\nName: " + customer1.getName());
        //System.out.println(customer1);
// Doc data tu ban phim va su dung Construstor hoac setter de tao Customer (su dung scanner)
        Scanner valo = new Scanner(System.in);


        System.out.println("Enter Customer Name: ");


        String name = valo.nextLine();
        currentId++;
        Customer customer = new Customer(currentId, name);
        System.out.println("ID:" + customer.getId()  );
        System.out.println("Username is: " + name);


    }

}

