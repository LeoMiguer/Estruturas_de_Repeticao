package estruturas_de_repeticao;

public class Atividade25 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Lojas Quase Dois - Tabela de preços");
        while(i <= 50){
            double valor = i * 1.99;
            System.out.println(i + " - R$ " + valor);
            i = i + 1;
        }
    }
}
