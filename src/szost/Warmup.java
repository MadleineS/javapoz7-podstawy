package szost;

import java.util.Arrays;

import static com.sun.org.apache.xml.internal.serializer.utils.Utils.messages;

public class Warmup {
    public static void main(String[] args) {
        String[] names = {"Jan", "Anna", "Mateusz", "Amelia", "Agnieszka"};
        System.out.println("Number of a in Anna =" + letterCounter( "AnnaA", 'A'));
        System.out.println("Number od a in" + Arrays.toString(names)+ "=" + letterCounter(names, 'a') );

        //metoda przyjmujaca tablice stringow z imionami, zliczamy w petli ile jest zenskich imion endsWith(); -a
    }
public static int letterCounter(String[] messages, char c) {
        int counter = 0;
    for (int i = 0; i < messages.length; i++) {
        counter += letterCounter(messages[i], c);
    }
    return counter;
}

    public static int letterCounter(String text, char c) {
        char[] chars = text.toCharArray();
        int counter = 0;
        char capitalizedChar = capitalize(c);
        for (int i = chars.length - 1; i >= 0; i--) {
            if (capitalize(chars[i]) == capitalizedChar) {
                counter++;
            }
        }
        return counter;
    }

    public static char capitalize(char c) {
        if (c >= 'a' && c <= 'z') {
            c = (char) (c - 32);
        }
        return c;
    }


    }
