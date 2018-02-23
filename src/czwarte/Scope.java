package czwarte;

public class Scope {
    public static void main(String[] args) {
        int number = 21;
        

        scope();
    }
    //zakresy zmienny, int itd
    private static void scope() {
        int number = 15000000;
        System.out.println(number + number);
        System.out.println("MAX_VALUE = " + (Integer.MAX_VALUE));
        System.out.println("MIN_VALUE = " + (Integer.MIN_VALUE));

        long bigNumber = 300000000000L;
        System.out.println(bigNumber);
        System.out.println("MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("MAX_VALUE = " + Long.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);

        //kod binarny - tylko dwa znami 0,1
    }
}
