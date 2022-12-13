import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas das matrizes: ");
        int l = sc.nextInt();
        System.out.println("Digite a quantidade de colunas das matrizes: ");
        int c = sc.nextInt();
        int[][] matrizA = new int[l][c];
        int[][] matrizB = new int[l][c];
        int[][] matrizC = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("MATRIZ A: Digite valor da linha " + i + " e coluna " + j + ": ");
                int valor = sc.nextInt();
                matrizA[i][j] = valor;
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("MATRIZ B: Digite valor da linha " + i + " e coluna " + j + ": ");
                int valor = sc.nextInt();
                matrizB[i][j] = valor;
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                int valorA = matrizA[i][j];
                int valorB = matrizB[i][j];
                int soma = valorA + valorB;
                matrizC[i][j] = soma;
            }
        }

        System.out.println("\nSegue abaixo a matriz C: ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                int valor = matrizC[i][j];
                System.out.print(valor + "\t");
            }
            System.out.print("\n");
        }
    }
}
