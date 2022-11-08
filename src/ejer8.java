public class ejer8 {
    public static void main(String[] args) {
        int[] numberArray = new int[10];

        ejer1.fillArray(numberArray);
        showAverageArray(numberArray);
    }

    protected static void showAverageArray(int[] numberArray) {
        int negative=0,positive=0,total=0;
        int contnegative=0,contpositive=0;

        for (int i = 0; i < numberArray.length ; i++) {
            System.out.print("nº"+i+" = "+numberArray[i]);
            if (numberArray[i]==0){
                System.out.print(" -> ZERO");
                System.out.println();
            }
            else if (numberArray[i]>0){
                System.out.print(" -> POSITIVE");
                positive+=numberArray[i];
                total+=numberArray[i];
                contpositive++;
                System.out.println();
            }else{
                System.out.print(" -> NEGATIVE");
                negative+=numberArray[i];
                total+=numberArray[i];
                contnegative++;
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("AVG POSITIVE: "+positive/ contpositive);
        System.out.println("AVG NEGATIVE: "+negative/ contnegative);
        System.out.println("AVG TOTAL: "+total / numberArray.length);
    }
}
