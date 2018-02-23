package czwarte;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {

        //napisać petle, ktora odwraca liczbe np. 12345 -> 54321 , 1200 -> 21
      System.out.println();
        System.out.println("Zadanie 1 odwracanie liczb");
        int number = 1201;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber *= 10;
            reversedNumber += digit;
            number /=10;

        }
        System.out.println("ReversedNumber =" + reversedNumber);

        //wczytujemy n liczb i sumujemy wszystkie liczby  123, 456 -> 1+2+3+4+5

//          System.out.println();
//          System.out.println("Zadanie nr 2 wczytywanie i sumowanie liczb");
//          Scanner scanner = new Scanner(System.in);
//          int n = 4;
//          int sum = 0;
//          for (int i = 0; i < n; i++) {
//              System.out.println("Insert number");
//              //sumowanie liczb
//              while (value != 0) {
//                  int digit = value % 10;
//                  sum += digit;
//                  value /= 10;
//              }
//          }
//
//        System.out.println("Sum = "+ sum);

        System.out.println();
        System.out.println("Zadanie nr 3 pozbyc sie wszystkich 0 z liczby np. 120002 ->221");

      int numberWithZeros = 1020502;
      int numberWithoutZeros = 0;
      int multiplier = 1;
      while (numberWithZeros != 0) {
          int digit = numberWithZeros % 10;
          if (digit != 0) {
              numberWithoutZeros += digit * multiplier;
              multiplier *= 10;
          }
          numberWithZeros /= 10;
      }
          System.out.println("Number Without Zeros = " + numberWithoutZeros);
      }

    }

