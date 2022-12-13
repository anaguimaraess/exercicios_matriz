import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        boolean simetrica = true;
        for (int i = 0; (i < matriz.length) && (simetrica == true); i++) {
            for (int j = 0; (j < i) && (simetrica == true); j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    System.out.println(false);
                } else {
                    System.out.println(true);
                }
            }
        }
    }
}