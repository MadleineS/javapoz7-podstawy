import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        // pobrac od usera wiek - liczbe
        // jezeli wiek < 6 "powinienes isc do przedszkola"
        // jezeli wiek < 12 " Powieniens isc do podstawowki"
        // jezeli wiek <16 gimnazjum
        //jezeli wiek < 20 srednia
        //else uczelnia
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your age: ");
        int age = scanner.nextInt();
        if (age < 6) {
            System.out.println("Go to kindergarden");

        } else if (age < 12) {
            System.out.println("Go to primary school");
        } else if (age < 16) {
            System.out.println("Go to middle school");
        } else if (age < 20) {
            System.out.println("Go to high school");
        } else {
            System.out.println("Go to university");
        }
        if (age >= 0 && (age < 18 || age >= 65)) ;

        //1. wyswietlic wiadomosc"a" jezeli wiek jest wiekszy od 30 i podzielny przez 3
        //2. wyswietlic wiadomosc"b" jezeli wiek jest mniejszy od 15 lub wiekszy od 60  i wiek/ 5 ma reszte 2

        if (age > 30 && age % 3 == 0) {
            System.out.println("a");
            if ((age <15 || age > 60) && age % 5 ==2);
            System.out.println("b");



            }

        }
    }


