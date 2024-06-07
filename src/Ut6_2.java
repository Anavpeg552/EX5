import java.util.Scanner;
import java.util.TreeSet;

public class Ut6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra = "";
        TreeSet <String>palabras = new TreeSet<>();

        do{
            palabra = scanner.nextLine();
            palabras.add(palabra);

        }while(palabra == "FIN");





        for (int i = 0; i < palabras.size(); i++) {
            System.out.println(palabras.contains(i));
        }
    }
}
