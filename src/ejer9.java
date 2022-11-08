import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        float[] array;
        float average;
        array = new float[ejer2.askForArraySize()];

        fillFloatArray(array);
        average = calcTheAverage(array);
        showAveragedArray(array,average);
    }

    private static float calcTheAverage(float[] array) {
        float total=0,average;
        for (int i = 0; i < array.length; i++) {
            total+= array[i];
        }
        average = total / array.length;
        System.out.println("Average Height: "+average);
        return average;
    }

    protected static void fillFloatArray(float[] numberArray) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Enter number nº"+i+":");
            numberArray[i] = sc.nextFloat();
        }
    }

    protected static void showAveragedArray(float[] numberArray,float average) {
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("nº" + i + " = " + numberArray[i] + " ");
            if (average == numberArray[i]) {
                System.out.println("Equals the average");
            } else if (average < numberArray[i]) {
                System.out.println("Above the average");
            } else {
                System.out.println("Below the average");
            }
        }
    }
}

