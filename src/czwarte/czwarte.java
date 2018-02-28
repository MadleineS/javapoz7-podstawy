package czwarte;

import java.util.Arrays;

public class czwarte {
    //kdoowanie i odkodowywanie szyfru cezara
    public static void main(String[] args) {

        int offset = 2;
        String secretMessage = "ala ma kotZa zy";
        String expectedMessage = "cnc oc mqvBc ba";

        char[] chars = secretMessage.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //  if (chars[i] == 32)
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'z')) {
                if ((chars[i] + offset) > 'Z' && (chars[i] + offset) < 'a')
                    chars[i] = 'A';
            } else if ((chars[i] + offset) > 'z') {
                chars[i] = 'a';
                if (chars[i] != ' ') {
                    if (chars[i] + offset > 'z') {
                        chars[i] = 'a';
                    } else {
                        chars[i] += offset;
                    }

                }
            }


            System.out.println(("Expected = " + expectedMessage));
            System.out.println("Actual =" + String.valueOf(chars));
            System.out.println("Correct =" + (expectedMessage.equals(String.valueOf(chars))));
        }

        // tablica liczb.definiujemy liczby. tworzymy 2 tablice z elementami odpowiednio mniejszymi i wiekszymi

        int[] numbers = {10,20,30,40,60,70,80};
        int searchingNumber = 40;

        int i =0;
        while (i < numbers.length && numbers[i] != searchingNumber) {
            i++;
        }
       if (i < numbers.length) {
           int[] smallersNumbersArray = new int[i+1];
           int[] biggerNumbersArray = new int[numbers.length - (i+1)];

           for (int j = 0; j < smallersNumbersArray.length; j++) {
               smallersNumbersArray[j] = numbers[j];
           }
           for (int j =0; j< biggerNumbersArray.length; j++) {
               biggerNumbersArray[j] = numbers[j+i+1];
           }
           System.out.println(Arrays.toString(numbers));
           System.out.println(Arrays.toString(smallersNumbersArray));
           System.out.println(Arrays.toString(biggerNumbersArray));
       } else {
           System.out.println( "Numbers" + secretMessage + "not found.");
       }

    }
}