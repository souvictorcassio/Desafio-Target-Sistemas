import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int numero, cont1 = 0, cont2 = 1, soma = 0;
        boolean pertence = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para o calculo da sequencia de Fibonacci: ");
        numero = scan.nextInt();
        
        scan.close();

        System.out.println(cont1);
        System.out.println(cont2);

        while (soma <= numero) {
            
            soma = cont1 + cont2;
            System.out.println(soma);

            cont1 = cont2;
            cont2 = soma;

            if (soma == numero) {
                System.out.println("O número " + numero + " pertence a sequencia de Fibonacci");
                pertence = true; 
            }
        }

        if (pertence == false) {
            System.out.println("O número " + numero + " não pertence a sequencia de Fibonacci");
        }
    }
}