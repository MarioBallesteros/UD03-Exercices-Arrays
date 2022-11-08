public class ejer7 {
    public static void main(String[] args) {
        int[] numberArray = new int[5];

        ejer1.fillArray(numberArray);
        showCountedArray(numberArray);

    }

    protected static void showCountedArray(int[] numberArray) {
        int negative=0,positive=0,zero=0;

        for (int i = 0; i < numberArray.length ; i++) {
            System.out.print("nº"+i+" = "+numberArray[i]);
            if (numberArray[i]==0){
                System.out.print(" -> ZERO");
                System.out.println();
                zero++;
            }
            else if (numberArray[i]>0){
                System.out.print(" -> POSITIVE");
                positive++;
                System.out.println();
            }else{
                System.out.print(" -> NEGATIVE");
                negative++;
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("TOTAL POSITIVE: "+positive);
        System.out.println("TOTAL NEGATIVE: "+negative);
        System.out.println("TOTAL ZERO: "+zero);
    }
}
