import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        int[] array;
        array = new int[ejer2.askForArraySize()];

        fillArray(array);
        showArrayWithHigher(array);
    }

    private static int createRandomPrimeNumber(int min, int max){
        int number;
        boolean prime =false;
        Scanner sc = new Scanner(System.in);

        do {
            number = (int) (Math.random() * (max-min));
            if (esPrimo(number)) prime = true;
        }while (!prime);
        return number;
    }

    protected static void fillArray(int[] numberArray) {
        int max,min;
        Scanner sc = new Scanner(System.in);

        System.out.println("Range for the numbers:");
        System.out.println("lower num:");
        min = sc.nextInt();
        System.out.println("higher num:");
        max = sc.nextInt();
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = createRandomPrimeNumber(min,max);
        }
    }

    protected static void showArrayWithHigher(int[] numberArray) {
        int higher=0;
        for (int i = 0; i < numberArray.length ; i++) {
            System.out.println("nº"+i+" = "+numberArray[i]);
            if (numberArray[i]>=higher){
                higher=numberArray[i];
            }
        }
        System.out.println("higher number:"+higher);
    }
    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}
