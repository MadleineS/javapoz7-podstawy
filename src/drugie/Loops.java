package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
       // forLoopExample();
        int n =4;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int i= 0; i <n; i++) {
           System.out.println(2* (i+1));
        }
        for (int i =0; i <2 * n; i+=2) {
            System.out.println(i+2);
        }
                 //if(i % 2 == 0) )

//2. wyswietlic parzyste liczby od 1 do n
        System.out.println();
        System.out.println("Parzystosc liczb");
for (int i=0; i<n; i++) {
            if ((i+2) % 2 == 0) {
                System.out.println(i);
            }
}
for (int i=2; i<= n; i+=2) {
    System.out.println(i);
}

// 3. wyswietlic tylko liczby podzielne przez 3 do n
        System.out.println();
        System.out.println("Liczby podzielne przez 3");
for (int i=0; i <n; i++) {
    if (i !=0 && i % 3 == 0) {
        System.out.println(i);
    }
}
//4. wyswietlic n liter "a"

        for (int i=0; i<n; i++) {
            System.out.println("a ");
        }

        //5. wyświetlic kwadraty kolejnych liczb

        for (int i=0; i<n; i++){
            System.out.println(i * i);
        }

        //5 oblicz kolejne 
        /*
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println("Sum ="+(a+b+c+d+e));
    }

    private static void forLoopExample() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Insert number of elements to multiply");
        int n = scanner.nextInt();
        for (int i = 0; i <n; i +=3) {
            int number = scanner.nextInt();
            if (number >=5 && number <=20) {
                System.out.println((i + 1) + ". Pow(" + number + number + ") =" + (number * number));
            }
        }
        System.out.println("End of program"); */
    }
}
