import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        int[] array;
        array = new int[ejer2.askForArraySize()];

        fillArray(array);
        ejer1.showArray(array);
    }

    private static int createRandomPrimeNumber(){
        int max=9,min=0;
        int number=100;
        boolean notprime =false;
        do {
            number = (int) (Math.random() * (max-min));
            System.out.println(number);
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    notprime = true;
                }
            }
        }while (notprime);
        return number;

    }

    protected static void fillArray(int[] numberArray) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = createRandomPrimeNumber();
        }
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
