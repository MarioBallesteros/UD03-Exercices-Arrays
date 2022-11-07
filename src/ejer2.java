import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        int[] array;
        array = new int[askForArraySize()];

        fillArray(array);
        ejer1.showArray(array);
        System.out.println("the sum of all numbers is: "+  sumArray(array));

    }

    protected static int sumArray(int[] array) {
    int totalSum=0;

        for (int num: array) {
            totalSum+=num;
        }
        return totalSum;
    }

    private static int createRandomNumber(){
        int max=9,min=0;
        int number = (int) (Math.random() * (max-min));

        return number;
    }

    protected static void fillArray(int[] numberArray) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = createRandomNumber();
        }
    }
    protected static int askForArraySize() {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("size for the array:");
        size = sc.nextInt();
        return size;
    }

}
