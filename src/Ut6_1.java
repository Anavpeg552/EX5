import java.util.Scanner;

public class Ut6_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=10; i>1; i--){
            int numero;
            if(numero>0 && numero<=100){
                System.out.print("Quedan "+i+": "+numero);
                numero=sc.nextInt();
            }else{
                System.out.println("NO VALIDO");
                i++;
            }


        }
    }

}

