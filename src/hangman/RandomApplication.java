package hangman;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomApplication {
    public static void main(String[] args) {

        int[] array = randomArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ". " + array[i]);
        }
        //nowa tablica n elementowa zlozona z losowych liczb

        //nowa tablica o wielkosci zdefiniowanej przez usera elementowa zlozona z losowych liczb
        //z zakresu podanego przez usera
        //suma losowych elementow
        //metoda symulujaca rzut kostka do gry (zwraca wartosc)

        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.println(random.nextInt(86));

        }
        randomArrayFromUser();
    }

    public static void randomArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify size");
        int size = scanner.nextInt();
        System.out.println("Specify bound");
        int bound = scanner.nextInt();
        System.out.println("Specify offset");
        int offset = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(bound) + offset;
            array[i] = number;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    //wygenerowac 10 losowych liczb parzystych z zakresu 0 - 10 wlacznie (zadanie domowe) - metoda

    public static void randomArrayOfEveNumbers() {
        int [] array = new int[10];
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            array[i] = random.nextInt((5)* 1) * 3;
        }
    System.out.println(Arrays.toString(array));
      }
//


    public static void sum () {
        //todo: napisac jeszcze raz generowanie liczb
        int[] array = randomArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum);
    }

    public static int[] randomArray() {
       int n =10;
       int[] array = new int[n];
       Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] =  random.nextInt();
        }
       return array;



        }
    }


