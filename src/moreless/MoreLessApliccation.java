package moreless;

import java.util.Random;
import java.util.Scanner;

public class MoreLessApliccation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println("1. Start");
            System.out.println("2. zasady");
            System.out.println("3. bot");
            System.out.println("0. Koniec");
            answer = scanner.nextInt();
            scanner.nextLine();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    startGame (scanner);
                    break;
                case 2:
                    showRules(scanner);
                    break;
                case 3:
                    measureDummyBot();
                    measureAnotherBot();
                    //dummyBot(15);
                    break;
            }

        } while (answer != 0);
    }

    private static void measureAnotherBot() {
        int sum = 0;
        for (int i = 0; i <100 ; i++) {
            sum += anotherBot(generateGameNumber());
        }
        System.out.println("Dummy bot statitics:  " + (sum/100));
    }

    private static int anotherBot(int secretNumber) {
        int number;
        int counter = 0;
        do {
            number = counter;
            counter++;
        }while (compare(number,secretNumber) !=0);
        return counter;
    }

    private static void measureDummyBot() {
        //wywolanie DummyBot 100 razy
        int sum = 0;
//        for (int i = 0; i <100 ; i++) {
//            sum += dummyBot(generateGameNumber());
//        }
        System.out.println("Dummy bot statitics:  " + (sum/100));
    }


    private static void startGame(Scanner scanner) {
        System.out.println("Press any key to continue");
        scanner.nextLine();
        int secretNumber = generateGameNumber();
        int counter = 0;
        int userNumber;
        do {
            System.out.println("Insert next number");
            userNumber = scanner.nextInt();
            scanner.nextLine();
            counter++;
            gameStep(userNumber, secretNumber);

        }while (userNumber != secretNumber);
        System.out.println("Game is finished! Result: " + counter);

        }

    private static void gameStep(int number, int secretNumber) {
        if (compare(number,secretNumber) == -1) {
            System.out.println("Number is to small");
        }else if (compare(number, secretNumber) == 1){
            System.out.println("Number is to big");
        }
    }

        //budowanie boota automat do grania
    private static void dummyBot(int secretNumber) {
        int number;
        int counter = 0;
        Random random = new Random();
        do {
            number = random.nextInt(101);
            counter++;
        }while (compare(number, secretNumber) != 0);
        System.out.println("Dummy bot result: " + counter);
    }

        private static int compare(int number, int secretNumber){
       // return Integer.compare(number,secretNumber);
        return number < secretNumber ? -1 : (number > secretNumber ? 1 : 0);
        }

        private static int generateGameNumber(){
        Random random = new Random();
        return random.nextInt(101);
    }

    private static void showRules(Scanner scanner) {
        System.out.println("Tutaj bedzie wyswietlanie zasad");
    }
}
