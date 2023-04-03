package BookStore;

import java.util.ArrayList;
import java.util.Scanner;

public class SamBookStoreApp {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        //Book class ko array banako -> book1, book2 banayera esko bitra halnalai
        Scanner sc = new Scanner(System.in);
        Book book1 = new Book();
        Book book2 = new Book();

        //input and add using for()
//        for (int i = 1; i <= 2; i++) {
//            Book book = new Book();
//            System.out.print("Enter book name : ");
//            book.setName(sc.nextLine());
//            System.out.print("Enter author name : ");
//            book.setAuthor(sc.nextLine());
//            System.out.print("Enter price : ");
//            book.setPrice(sc.nextInt());
//            sc.nextLine();                      //garbage collector; new line consumer
//            System.out.print("Enter quantity : ");
//            book.setQuantity(sc.nextInt());
//            sc.nextLine();                      //garbage collector; new line consumer
//            System.out.print("Enter customer type : ");
//            book.setCustomerType(sc.next());
//            books.add(book);
//            sc.nextLine();
//            System.out.println("\n");
//        }

        //can use for() -> {create instance of Book, add to arraylist}; efficient
        System.out.print("Enter book name : ");
        book1.setName(sc.nextLine());
        System.out.print("Enter author name : ");
        book1.setAuthor(sc.nextLine());
        System.out.print("Enter price : ");
        book1.setPrice(sc.nextInt());
        sc.nextLine();                      //garbage collector; new line consumer
        System.out.print("Enter quantity : ");
        book1.setQuantity(sc.nextInt());
        sc.nextLine();                      //garbage collector; new line consumer
        System.out.print("Enter customer type : ");
        book1.setCustomerType(sc.next());
        books.add(book1);                   //adding book1 to the arraylist

        sc.nextLine();                      //garbage collector; new line consumer

        System.out.print("Enter book name : ");
        book2.setName(sc.nextLine());
        System.out.print("Enter author name : ");
        book2.setAuthor(sc.nextLine());
        System.out.print("Enter price : ");
        book2.setPrice(sc.nextInt());
        sc.nextLine();                      //garbage collector; new line consumer
        System.out.print("Enter quantity : ");
        book2.setQuantity(sc.nextInt());
        sc.nextLine();                      //garbage collector; new line consumer
        System.out.print("Enter customer type : ");
        book2.setCustomerType(sc.next());
        books.add(book2);                   //adding to arraylist

        System.out.println("\n\n");

        for (Book book : books){
            System.out.println(book.toString());
        }

        //generating bill with discounts for regular customer
        System.out.println("\nGenerating bill for two customers......");

        for (Book book : books){
            int price = book.getPrice()*book.getQuantity();
            if (book.getCustomerType().equalsIgnoreCase("Regular")){
                price -= 200;
                book.setPrice(price);
            }
            else {
                book.setPrice(price);
            }
            System.out.println(book.toString());
        }
    }
}
