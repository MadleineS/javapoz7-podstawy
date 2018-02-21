import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");


        Scanner reader = new Scanner(System.in);
        //   int someValue = reader.nextInt();
        //  System.out.println(someValue);

        //pobrać liczby

        //wyswietlic liczby
        //int firstValue = 5;
        //int secondValue = 10;
        System.out.println("Insert first value");

        int firstValue = reader.nextInt();

        System.out.println("Insert second value");
        int secondValue = reader.nextInt();
//wykonac działania

        int addResult = firstValue + secondValue;
        int subtracktResult = firstValue - secondValue;
        int multiplyResult = firstValue * secondValue;
        double divideResult = 0;
        if (secondValue != 0) {
            divideResult = (double) firstValue / secondValue;
        }
        System.out.println("add = " + addResult);
        System.out.println("subtract = " + subtracktResult);
        System.out.println("multiply = " + multiplyResult);
        if (secondValue != 0) {
            System.out.println("divide = " + divideResult);
        }
        System.out.println("sum = " + firstValue + secondValue);

        System.out.println(firstValue + "+" + secondValue + "=" + (firstValue + secondValue));
        System.out.println(firstValue + "-" + secondValue + "=" + (firstValue - secondValue));
        System.out.println(firstValue + "*" + secondValue + "=" + (firstValue * secondValue));
        if (secondValue != 0) {
            System.out.println(firstValue + "/" + secondValue + "=" + ((double) firstValue / secondValue));
        }

        //wyświetlić informacje o liczbach
        //czy liczby są równe           firstValue == secondValue
        //wyświetlić większą liczbę     firstValue >= secondValue -> firstValue
        // firstValue != secondValue;   firstValue >=secondValue ->firstValue
        //czy jest dzielenie z resztą
        //wyświetlić parzyste liczby


        if (firstValue == secondValue) {
            System.out.println("Values are equal");
        } else {
            System.out.println("Values are equal");
        }


        if (firstValue != secondValue) {
            System.out.println("Values are not equal");
        }

        if (firstValue > secondValue) {
            System.out.println("First value is bigger than second");
        } else if (firstValue<secondValue) {
            System.out.println("Second value is bigger than first one");
        } else {
            System.out.printf("Values are equal");
        }

        if (firstValue < secondValue) {
            System.out.printf("Second value is bogger than first one");
        }

        if (firstValue % secondValue != 0) {
            System.out.printf("Liczby podzielone z reszta");
        } else {
            System.out.printf("Liczby podzielne z reszty");
        }

        if (firstValue % 2 == 0) {
            System.out.println("First value is even");
        } else {
            System.out.println("First value is even");
        }
        if (secondValue % 2 == 0) {
            System.out.println("Podana liczba nie jest parzysta.");
        }


    }
}


