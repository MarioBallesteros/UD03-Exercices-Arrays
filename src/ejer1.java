import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        int[] numberArray = new int[5];

        fillArray(numberArray);
        System.out.println("Your filled array:");
        showArray(numberArray);

    }
    protected static void fillArray(int[] numberArray) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Enter number nº"+i+":");
            numberArray[i] = sc.nextInt();
        }
    }
    protected static void showArray(int[] numberArray) {
        for (int i = 0; i < numberArray.length ; i++) {
            System.out.println("nº"+i+" = "+numberArray[i]);
        }
    }

}
