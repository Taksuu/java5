import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Insira números inteiros (número negativo para sair):");
        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            soma += numero;
        }

        System.out.println("A soma dos números positivos é: " + soma);
        scanner.close();
    }
}