package oop.bookstore;

import java.util.Scanner;

public class bookstore {
    public static void main(String[] args) {
//        book book = new book("Krzyzacy", 1950);
//        book.setPublisher ("PKW");
//        book.setDescription("Ksiazka o sredniowiecznej Polsce");
//        System.out.println(book);
//
//        book.book1 = new book("W pustyni i w puszczy", 1955);
//        System.out.println(book1);
//
//        Author author = new Author ("Henryk Sienkiewicz");
//        author.setBirthDate("15-02-1900");
//        author.setLanguage
        book[] books = new book[10];
        author[] authors = new author[5];
        Scanner scanner = new Scanner(System.in);
        int answer;
    do{
    System.out.println("1. Authors");
    System.out.println("2. Books");
    System.out.println("Exit");
    answer = scanner.nextInt();
    scanner.nextLine();
    switch (answer) {
        case 1:
            authorsList(scanner, authors);
            break;
        case 2:
            bookslList(scanner, books);
            break;
    }

}   while (answer !=0);
    }

    private static void authorsList(Scanner scanner, author[] authors) {
        list(authors);
        scanner.nextLine();
    }

    private static void bookslList(Scanner scanner, book[] books) {
        list(books);
        scanner.nextLine();
    }
//todos obiektowy status name data, wydzielic date do obiektu. Moze miec przypisanie owner. dodatkowa klasa owner - imie naziwsko.zdefiniowac klasy na todos. Jeszcze raz napisac klase toods w oparciu o konsole.

    private static void list (Object[] array){
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
