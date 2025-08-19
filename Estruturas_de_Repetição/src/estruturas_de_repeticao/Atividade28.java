package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        i = 1;
        while(i <= 10){
            System.out.println("Tabuada do " + i + ":");
            j = 1;
            while(j <= 10){
                System.out.println(i + " x " + j + " = " + (i * j));
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }

        sc.close();
    }
}
