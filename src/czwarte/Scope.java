package czwarte;

//kodowanie i odkodowywanie szyfru cezara
//tablica liczb.definiujemy liczbe. tworzymy 2 tablice z elementami i odpowiednio mniejszymi i wiekszymi

import java.lang.reflect.Array;

public class Scope {
    public static void main(String[] args) {
//wypisanie kolejnych liter alfabetu, 3 mozliwosci wpisania kodu
        String[] names = {"Jan", "Anna", "Marek"};
                for (int i = 0; i < names.length; i++) {
            System.out.println(names [i]);
        }

        //1. zdefiniowac tablice z kilkoma liczbami, obliczyc sume
        int [] array = {1,2,3,4,5,6};
        int sum =0;
        for (int i =0; i <array.length; i++) {
                    sum += array[i];
                }
        System.out.println(sum);


        //2. zdefiniowac tablice z kilkoma liczbami, obliczyc srednia

        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        System.out.println( sum / array.length);


        //3. zdefiniowac tablice z kilkoma liczbamia. obliczyc max i min

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        //kodowanie i odkodywyania


        //4. zdefiniowac tablice z kilkoma liczbami, zliczamy ilosc elementow do wystapienia liczby ujemnej
//        int [] arrayWithValues = {1,4,6,7,-4,2};
//        int counter = 0;
//        while (counter <arrayWithValues.length && arrayWithValues[counter] >= 0;  {
//                counter++;
//            }
//            System.out.println("counter of positive number =" + counter);
//        }





        //7. utworzyc tablice n elementowa tylko z parzystych liczb

        //int[] arrayOfEvenNumber = new int[n];
        //for (int i = 0)

            //8. zapytac usera o rozmiar i utworzyc tablice
//            int size = 5;
//        int[] descendingNumbers = new int[size];
//        for (int i = 0; i < size; i++) {
//            descendingNumbers[i] = descendingNumbers.length - i;
//        }
//        System.out.println(Array.toString(descendingNumbers));
    }


//9 .zapytac usera o rozmiar, umozliwic mu wstawienie elementow i obliczy srednia







       // UseChar();


//        int number = 21;
//        int multiplier = 1;
//        int binaryCode = 0;
//        while (number !=0) {
//            int bit = number % 2;
//            binaryCode += bit * multiplier;
//            multiplier *= 10;
//            number /= 2;
//        }
//
//        scope();
//    }
//    //zakresy zmienny, int itd
//    private static void scope() {
//        int number = 15000000;
//        System.out.println(number + number);
//        System.out.println("MAX_VALUE = " + (Integer.MAX_VALUE));
//        System.out.println("MIN_VALUE = " + (Integer.MIN_VALUE));
//
//        long bigNumber = 300000000000L;
//        System.out.println(bigNumber);
//        System.out.println("MAX_VALUE = " + Long.MAX_VALUE);
//        System.out.println("MAX_VALUE = " + Long.MIN_VALUE);
//
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Float.MAX_VALUE);

        //kod binarny - tylko dwa znami 0,1

//    private static void UseChar() {
//        String message = "Hello WOrld";
//        char[] messageAsCharArray = message.toCharArray();
//        int length = messageAsCharArray.length;
//        System.out.println(messageAsCharArray[0]);
//        System.out.println(messageAsCharArray[1]);
//        System.out.println(messageAsCharArray[2]);
//        System.out.println(messageAsCharArray[3]);
//
//        int[] array = {1,2,3,4,5,6};
//        int size = 10;
//        int[] emptyArray = new int [size];
//        int [] emptyArray2 = new int[size];
//        emptyArray[0] = 2;
//        array [6] =3;
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        char znak = 'a' + 3;
//        System.out.println(znak);
//        System.out.println((int) znak);
//        char a = (char)99;
//        System.out.println('c' + 1);
//        for (int i = 0; i <= 122 - 97; i++) {
//            System.out.println((char) (a + i));
//        }
//
//        for (int i = 97; i <= 122; i++) {
//            System.out.println((char) i);
//        }
//        System.out.println();
//        for (char i = 'a'; i <= 122; i++) {
//            System.out.println(i);
 //       }
  //  }
}
