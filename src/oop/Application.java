package oop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = createUser(scanner);
        System.out.println(user.firstName);

//        User user2 = new User();
//        user2.firstName = "Jan";
//        user2.lastName = "Kowalski";
//        System.out.println(user.firstName);
//        System.out.println(user.firstName + " " + user.lastName +
//                ", phoneNumber: " + user.phoneNumber + ", email: " + user.email);
//        user.introduceYourself();
//        user2.introduceYourself();;

        Address address = new Address();
        address.city = "Poznan";
        address.street = "Polwiejska";
        address.number = 20;
        address.postalCode = "60-371";

        user.address = address;

//        Address blabla = new Address("assf", "sdsfs"){
//            blabla.city = "Poznań";

            user.introduceYourself();
        }


       // address.show();

//        System.out.println("Insert firstName");
//        String firstName = scanner.nextLine();
//
//        System.out.println("Insert lastName");
//        String lastName = scanner.nextLine();
//
//        System.out.println("Insert email");
//        String email = scanner.nextLine();
//
//        System.out.println(firstName + " " + lastName + "' email" + email);

    public static User createUser(Scanner scanner) {
      User user = new User();
        System.out.println("Insert firstName");
        String firstName = scanner.nextLine();

        System.out.println("Insert lastName");
        String lastName = scanner.nextLine();


        user = new User(firstName, lastName);
        System.out.println("Insert phoneNumber");
        user.phoneNumber = scanner.nextLine();

        System.out.println("Insert email");
        user.email = scanner.nextLine();

        return user;

    }
}
