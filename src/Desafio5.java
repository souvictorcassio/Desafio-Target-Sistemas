import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase para invertê-la: ");
        String frase = scanner.nextLine();
        scanner.close();

        String invertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }

        System.out.println("String invertida: " + invertida);
    }
}

