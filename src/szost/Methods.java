package szost;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Factorial of 5 =" + factorial(5));
        System.out.println("Divisible by 2 and not by 3 =" + countDivisibleBy2AndNotBy3(array));
        System.out.println("Switched text = " + switchChars("Ala ma kota", 'a', 'b'));
        System.out.println("\"123\" is number =" + isNumber("123"));
        System.out.println("\"2a3\" is number =" + isNumber("2a3"));
        System.out.println("\"anna\" is palindrome =" + isPalindrom("anna"));
        System.out.println("\"kajak\"is palindrome =" + isPalindrom("kajak"));
        System.out.println("switched AbCd =" + switchCase("AbCd"));
        System.out.println("a;b;c; 0 (-1)=" + getNthIndexOf(';', "a;b;c", 0));
        System.out.println("a;b;c; 1(1) =" +getNthIndexOf(';',"a;b;c", 1));
        System.out.println("a;b;c; 2(3) =" +getNthIndexOf(';',"a;b;c", 2));
        System.out.println("a;b;c; 3(5) =" +getNthIndexOf(';',"a;b;c", 3));
        System.out.println("\"Ala ma kota\" split =" + Arrays.toString(split("Ala ma kota", ' ')));
        System.out.println("\"ab;cd;ef\" split =" + Arrays.toString(split("ab;cd;ef", ';')));
        System.out.println("\"ab;cd;ef\" split =" + Arrays.toString(split("ab;;cd;ef", ';')));
        System.out.println("\"Ala ma kota\" split2 =" + Arrays.toString(split2("Ala ma kota", ' ')));
        System.out.println("\"ab;cd;ef\" split2 =" + Arrays.toString(split2("ab;cd;ef", ';')));
        System.out.println("\"ab;cd;ef\" split2 =" + Arrays.toString(split2("ab;;cd;ef", ';')));

    }

    // kod Fibbonaciego
    public static int FibbonaciCode


    public static String [] split2 (String message, char c) {
        int size = Warmup.letterCounter(message, c) + 1;
        String[] resultArray = new String[size];
        int start = 0;
        int end;
        for (int i = 0; i <resultArray.length ; i++) {
           String textToPut = "";
           end = getNthIndexOf(c, message, (i+1));
            for (int j = start; j < end; j++) {
                textToPut += message.charAt(j);
            }
           resultArray[i] = textToPut;
            start = end +1;
        }
        return resultArray;
    }


//    public static String[] split (String message, char c) {
//        String [] array = new String[Warmup.letterCounter(message,c)];
//        int start = 0;
//        int end = getNthIndexOf(c, message, 0);
//        return array;
//    }
    //druga metoda na Split z dwoma if=ami

    public static  String[] split (String message, char c) {
        int size = Warmup.letterCounter(message, c) + 1;
        String[] resultArray = new String[size];
        String textToPut = "";
        int j = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != c) {
                textToPut += message.charAt(i);
                if (i == message.length() -1);{
                    resultArray[j] = textToPut;
                }
            } else {
                resultArray[j] = textToPut;
                j++;
                textToPut = "";
            }
            return resultArray;
        }
        int start = 0;
        //int end = getNthIndexOf
        return resultArray;
    }

     public static int getNthIndexOf (char c, String text, int index) {
        char[] chars = text.toCharArray();
        int i= -1;
        while (i < chars.length && index > 0){
            i++;
            if (i < chars.length && c == chars[i]) {
                index--;
            }

        }
        return i;
     }

    //switchcase zamienianie liter z malych na duze AbCd - aBcD

    public static String switchCase (String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = switchCase(chars[i]);
        }
        return String.valueOf(chars);
    }
    public static char switchCase (char c) {
        char switchedChar = c;
        if (c >= 'a' && c <= 'z') {
            switchedChar -= 32;
        } else if (c >= 'A' && c <= 'Z') {
            switchedChar += 32;
        }

        return switchedChar;
    }


    public static boolean isPalindrom(String text) {
        char[] chars = text.toCharArray();
        int i =0;
        while (i <chars.length / 2 && (Warmup.capitalize(chars[i]) == Warmup.capitalize (chars[chars.length - i -1]))){
            i++;
        }
        return  i == chars.length / 2;
//        for (int i = 0; i < chars.length / 2; i++) {
//            if (chars[i] != chars[chars.length - i -1]) {
//                result = false;
//            }
        }

    public static boolean isNumber(String numberCandidate) {
        char[] chars = numberCandidate.toCharArray();
        int i = 0;
        while (i < chars.length && (chars[i] >= '0' && chars[i] <= '9')) {
            i++;
        }
        return i == chars.length;
    }

    //zamiana jednego znaku na drugi w danym stringu
    public static String switchChars(String text, char from, char to) {
        char[] textAsChars = text.toCharArray();
        for (int i = 0; i < textAsChars.length; i++) {
            if (textAsChars[i] == from) {
                if (textAsChars[i] == from) {
                    textAsChars[i] = to;
                }
            }
            return String.valueOf(textAsChars);
        }
        return text;
    }



    //zliczanie liczb podzielnych przez 2, ale nie podzielnych przez 3
    public static int countDivisibleBy2AndNotBy3 (int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 !=0) {
              counter++;
            }
        }
        return counter;
    }

    //silnia(factorial) -> long
    public static long factorial(int number) {
        long result =1;
        for (int i = 1; i <  number; i++) {
            result *=i;

        }
        return result;
    }




        //split -> 123; abc;dd ->{"123","abc","dd"]
        //         dd.aa.cc -> ["dd", "aa","cc"]

        //fibonacci
    //odwracanie stringa test -> tset, abcde -> edcba
    //sprawdzanie nawiasow w stringu ")("
    // suma cyfr w stringu (wywloywanie jakich metod?) -> "1234"
        //sprawdzenie czy string jest liczba
        //sprwdzenie nawiasow w liczbie
        //metoda do porownywania 2 stringow
        //metoda wyswietlajaca sume liczb pierwszych w danej liczbie (1,2,3,5,7,11) np.
        //                             liczba 29 to -> 11 +11 +7
        //                              liczba 31 to -> 11+11+7+2


}
