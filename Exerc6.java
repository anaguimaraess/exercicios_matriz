import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matrizA: ");
        int lA = sc.nextInt();
        System.out.println("Digite a quantidade de colunas da matrizA: ");
        int cA = sc.nextInt();
        int[][] matrizA = new int[lA][cA];


        System.out.println("Digite a quantidade de linhas da matrizB: ");
        int lB = sc.nextInt();
        System.out.println("Digite a quantidade de colunas da matrizB: ");
        int cB = sc.nextInt();
        int[][] matrizB = new int[lB][cB];

        int[][] matrizC = new int[lA][cB];

        if (lA == lB && cA == cB){
            for (int i = 0; i < lA; i++) {
                for (int j = 0; j < cA; j++) {
                    System.out.println("MATRIZ A: Digite valor da linha " + i + " e coluna " + j + ": ");
                    int valor = sc.nextInt();
                    matrizA[i][j] = valor;
                }
            }

            for (int i = 0; i < lB; i++) {
                for (int j = 0; j < cB; j++) {
                    System.out.println("MATRIZ B: Digite valor da linha " + i + " e coluna " + j + ": ");
                    int valor = sc.nextInt();
                    matrizB[i][j] = valor;
                }
            }

            for (int i = 0; i < lA; i++) {
                for (int j = 0; j < cB; j++) {
                    for (int k = 0; k < lB; k++){
                        int valorA = matrizA[i][k];
                        int valorB = matrizB[k][j];
                        matrizC[i][j] += valorA * valorB;
                    }
                }
            }

            System.out.println("\nSegue abaixo a matriz C: ");
            for (int i = 0; i < lA; i++) {
                for (int j = 0; j < cB; j++) {
                    int valor = matrizC[i][j];
                    System.out.print(valor + "\t");
                }
                System.out.print("\n");
            }
        }else{
            System.out.println("Só é possível multiplicar matrizes de tamanhos iguais");
        }
    }
}
