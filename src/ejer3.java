public class ejer3 {
    public static void main(String[] args) {
        int[] array = new int[100];

        ejer2.fillArray(array);
        System.out.println("the sum of all numbers is: "+  ejer2.sumArray(array));
        System.out.println("the avg of all numbers is: "+ avgArray(array));

    }

    private static int avgArray(int[] array) {
        int total,avg;
        total = ejer2.sumArray(array);
        avg = total / array.length;

        return avg;
    }
}
