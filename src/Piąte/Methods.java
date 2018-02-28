package Piąte;

public class Methods {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};

       printArray(array);
       sumOfArray(array);

        int [] newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = 1;
        }
        printArray(newArray);
        sumOfArray(newArray);
    }

    public static void avg(int[] array) {
        
    }
           //napisać funkcję ktora przyjmuje tablice liczb i wypisuje ich sume
    public static void  sumOfArray (int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            sum +=array[i];
        }
        System.out.println(sum);
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
