import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num="";
        String clean="";
        int numclean;
        boolean find=false;
        boolean cont=true;


        while(cont){
            System.out.println("Introduce tu numero:");
            num= sc.nextLine();
            for (int i = 0; i < num.length(); i++) {
                if(num.charAt(i)=='1' ||num.charAt(i)=='2' ||num.charAt(i)=='3' ||num.charAt(i)=='4' ||num.charAt(i)=='5' ||num.charAt(i)=='6' ||num.charAt(i)=='7' ||num.charAt(i)=='8' ||num.charAt(i)=='9' ||num.charAt(i)=='0'){
                    clean+=num.charAt(i);
                    find=true;
                }
            }
            if(!find){
                System.out.println("Vaya, parece que no has introducido ningún numero, porfavor vuelve a intentarlo.");
            }else{
                numclean=Integer.parseInt(clean);
                if(numclean==0){
                    System.out.println("Tu numero es [CERO]     -> "+numclean);
                }else if(numclean<0){
                    System.out.println("Tu numero es [NEGATIVO]     -> "+numclean);
                }else if(numclean>0){
                    System.out.println("Tu numero es [POSITIVO]     -> "+numclean);
                }
                cont=false;
            }


        }
    }
}