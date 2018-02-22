package Trzecie;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        //wczytac liczbe n
        // zapytac n razy o liczbe
        //Scanner scanner = new Scanner (System.in);
        //podzielna przez 2 to pinformowac
        //podzielna przez 3 to pinformowac
        // podzielna przez 6 to pinformowac

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Insert next number");
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                System.out.println("Value is divisible by 6");
            } else if (number % 3 == 0) {
                System.out.println(" Value is divisible by 3");
            } else if (number % 2 == 0) {
                System.out.println("Value is divisible by 2");
            } else {
                System.out.println("Value is not divisible by 6, 3 or 2");
            }
        }


        // zadanie 2

        //zdefiniowac liczbe n

        // pobieracie n liczb

        //sprawdzacie, czy podana liczba jest weiksza od poprzedniej wprowadzonej

        System.out.println();
        System.out.println("Zadanie 2");
        int previousValue = 0;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value > previousValue) {
                System.out.println("Next value is bigger than previous one");
            } else if (value == previousValue) {
                System.out.println("Value is equal to previous one");
            } else {
                System.out.println("New value is smaller than previous one");
            }
            previousValue = value;
        }

        //zadanie 3

        //obliczyc sume n parzystych liczb nie podzielnych przez 3

        System.out.println();
        System.out.println("Zadanie 3");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i % 3 != 0) {
                //sum = sum + 1;
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
        //zadanie *
        // obliczyc silnie dla n
//int factorial = 1;
//for (int i = 1; i <n; i++){
  //  factorial *
}
    }



