import Controller.AccountController;
import Entity.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<Book> books = new ArrayList<>();
//
//        List<Author> authors = new ArrayList<>();
//        authors.add(new Author("Bean", Gender.M, "bean@gmail.com"));
//        authors.add(new Author("Hiu", Gender.M, "Hiu@gmail.com"));
//
//        books.add(new Book("Arifureta", authors.get(0), 150.0, 1000));
//        books.add(new Book("Your Name", authors.get(1), 200.0, 2102));
//        books.add(new Book("Black Myth Wukong", authors.get(1), 100.0, 3434324));
//
//        List<Book> listBookStored = books.stream()
//                .sorted(Comparator.comparing(Book::getName).reversed())
//                .toList();
//
//        listBookStored.forEach(book -> System.out.println("Tên sách: " + book.getName() + "     Giá: " + book.getPrice() + "       So luong: " + book.getQuantity()));
//
//        books.stream()
//                .filter((b)->b.getAuthor().getGender().equals(Gender.M))
//                .sorted(Comparator.comparing(Book::getPrice))
//                .forEach(System.out::println);
//
//        Optional<Book> bookMaxPrice = books.stream()
//                .max(Comparator.comparing(Book::getPrice));
//        System.out.println(bookMaxPrice);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập tên sách: ");
//        String bookNameInput = scanner.nextLine();
//
//        List<Book> booksByName = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getName().toLowerCase().contains(bookNameInput.toLowerCase())) {
//                booksByName.add(book);
//            }
//        }
//
////        for (Book book : books) {
////            if (book.getName().equalsIgnoreCase(bookNameInput)) {
////                booksByName.add(book);
////            }
////        }
//
//        if (booksByName.isEmpty()) {
//            System.out.println("Không tìm thấy sách với phần tên: " + bookNameInput);
//        } else {
//            System.out.println("Sách tìm thấy với phần tên \"" + bookNameInput + "\":");
//            for (Book book : booksByName) {
//                System.out.println("Tên sách: " + book.getName() + ", Giá: " + book.getPrice());
//            }
//        }
//
//        scanner.close();
List<Customer> customers = new ArrayList<>();
customers.add(new Customer(1,"Yone",Gender.M,"Ha Noi","0333333333","dsjd@gmail.com"));
        Account acc = new Account("C2309F", customers.get(0),20000);
        AccountController accController = new AccountController(acc);
        accController.deposit(120);
        System.out.println(acc);
        accController.withdraw(2200);
        System.out.println(acc);
    }
}
