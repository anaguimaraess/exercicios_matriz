import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorNumero = 0;

        System.out.println("Digite a quantidade de linhas: ");
        int l = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int c = sc.nextInt();
        int[][] matriz = new int[l][c];


        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Digite valor da linha " + i + " e coluna " + j + ": ");
                int valor = sc.nextInt();
                matriz[i][j] = valor;
            }
        }


        System.out.println("\n");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                int valor = matriz[i][j];
                if (maiorNumero < valor){
                    maiorNumero = valor;
                }
            }
        }
        System.out.println("O maior número da matriz é " + maiorNumero);
    }
}
