import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        char[] letters = new char[26];

        fillLetters(letters);
        showLetters(letters);
        askForLetter(letters);

    }

    private static void askForLetter(char[] letters) {
        Scanner sc = new Scanner(System.in);
        int position= -1;
        boolean keep = true;
        String keyboard="";
        do {
            System.out.print("Write your letter position:");
            position = sc.nextInt();
            if (position==-1) {
                keep=false;
            }else{
                keyboard+= letters[position];
                System.out.println("Your keyboard: "+keyboard);
            }


        }while (keep);
        System.out.println("Final Result: "+keyboard);

    }

    private static void showLetters(char[] letters) {
        int pos=0;

        System.out.print("Position: ");
        for (char letter:letters) {
            if (pos>=10)  System.out.print(pos+" ");
            else  System.out.print(pos+"  ");

            pos++;
        }
        System.out.println();
        System.out.print("Letter:   ");
        for (char letter:letters) {
            System.out.print(letter+"  ");
        }
        System.out.println();
    }

    private static void fillLetters(char[] letters) {
        for (char letter='A'; letter <= 'Z' ; letter++) {
            letters[letter-'A'] = letter;
        }
    }


}
