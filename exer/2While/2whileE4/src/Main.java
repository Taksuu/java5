import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        int N = scanner.nextInt();
        int i = 1;

        System.out.println("Números pares de 1 a " + N + ":");
        while (i <= N) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        scanner.close();
    }
}