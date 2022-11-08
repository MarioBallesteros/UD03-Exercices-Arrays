import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {

        String DNI = askforDNI();
        getLetter(DNI);
    }

    private static String askforDNI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("write your DNI without the letter:");
        return sc.nextLine();
    }

    private static void getLetter(String dni) {
        char[] letters = new char[23];
        int intDNI = Integer.parseInt(dni);

        letters[0]='T';letters[1]='R';letters[2]='W';letters[3]='A';letters[4]='G';
        letters[5]='M';letters[6]='Y';letters[7]='F';letters[8]='P';letters[9]='D';
        letters[10]='X';letters[11]='B';letters[12]='N';letters[13]='J';letters[14]='Z';
        letters[15]='S';letters[16]='Q';letters[17]='V';letters[18]='H';letters[19]='L';
        letters[20]='C';letters[21]='K';letters[22]='E';

        int position = intDNI % 23;
        dni+= letters[position]+"";
        System.out.println("Your letter: "+letters[position]);
        System.out.println("Full DNI: "+ dni);
    }

}
