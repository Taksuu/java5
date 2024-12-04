import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        numero = scanner.nextInt();

        do {
            System.out.println(numero);
            numero--;
        } while (numero > 0);

        System.out.println("Contagem regressiva finalizada.");
        scanner.close();
    }
}