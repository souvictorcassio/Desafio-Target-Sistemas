public class Desafio1 {
    public static void main(String[] args) throws Exception {
        int indice = 13, soma = 0, k = 0;

        while (k <  indice) {
            k++;
            soma = soma + k;

            System.out.println(soma);
        }

        System.out.println("O valor final de soma é " + soma);
    }
}
