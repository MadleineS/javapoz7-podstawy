package Piąte;

import com.sun.org.apache.xpath.internal.SourceTree;

import static jdk.nashorn.internal.objects.NativeMath.max;

public class Methods {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};

       printArray(array);
       int sum = sumOfArray(array);
       double avg = avg(array);

        System.out.println("Sum =" + sumOfArray(array));
        System.out.println("Avg =" + avg (array));
        System.out.println("Min =" + min(array));
        System.out.println("Max=" + max(array));
        System.out.println("Spread=" + spread(array));
        printArray(statsOfOccurences(array));
        System.out.println("Moda=" + moda(array));
        printArray(sortByCounting(array));

    }
    public static int[] sortByCounting(int[] array) {
        int[] sortedArray = new int[array.length];
        int[] stats = statsOfOccurences(array);
        int k =0;
        for (int i = 0; i < stats.length; i++) {
            for (int j = 0; j < stats[i]; j++) {
                sortedArray[k] = i + min(array);
                k++;
            }
        }
        return  sortedArray;
    }

    public static int[] statsOfOccurences(int[] array) {
        int[] statsArray = new int[spread(array)];
        int min = min(array);
        for (int i =0; i < array.length; i++) {
            statsArray[array[i] - min]++;
        }
        return statsArray;
    }
    public static int spread(int[] array){
        return (int) (max(array) - min(array) +1);
    }

    public static int min (int[] array) {
    int max = array[0];
    for (int i =1; i <array.length; i++) {
        if (max< array[i]) {
            max = array[i];
        }
    }
    return max;
    }

    //Statystyki

    //napisac metode ktora zwraca wartosc najmniejszego elementu z tablicy
    //napisac metode ktora zwraca wartosc nawiekszego elementu z tablicy
    //mediana
    public static int indexOfMax(int[] array) {
        int iMax = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > array[iMax]) {
                iMax = i;
            }
        }
        return iMax;
    }

    public static int moda(int [] array) {
        int[] stats = statsOfOccurences(array);
        int indexofMaximuValue = indexOfMax(stats);
        return indexofMaximuValue + min(array);
    }
    //rozpietosc
    //informacje o wystapieniu liczb
    //*na podstawie poprzedniej metody wypisac posortowana tabblice

    public static double avg(int[] array) {
        int sum = sumOfArray(array);
        return (double) sum / array.length;

        }


           //napisać funkcję ktora przyjmuje tablice liczb i wypisuje ich sume
    public static int  sumOfArray (int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            sum +=array[i];
        }
        return sum;

    }



    public static void printArray(int[] array){
      //  int[] array = {1,2,3,4,5,6,7,8};

        for (int i =0; i < array.length; i++) {
            System.out.println(array[i]);
            if (i!= array.length -1) {
                System.out.println(";");
            }
        }

        System.out.println("]");
    }
}
