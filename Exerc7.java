import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaOficial = 0;
        int soma = 0;
        int trueOrFalse = 0;

        System.out.println("Digite a quantidade de linhas e colunas: ");
        int lc = sc.nextInt();
        int[][] matriz = new int[lc][lc];

        for (int i = 0; i < lc; i++) {
            for (int j = 0; j < lc; j++) {
                System.out.println("Digite valor da linha " + i + " e coluna " + j + ": ");
                int valor = sc.nextInt();
                matriz[i][j] = valor;
            }
        }

        System.out.println("\n");
        for (int i = 0; (i < lc) && trueOrFalse == 0; i++) {
            for (int j = 0; j < lc; j++) {
                int valor = matriz[j][i];
                if (i == 0) {
                    somaOficial += valor;
                } else {
                    soma += valor;
                    if (soma == somaOficial) {
                        trueOrFalse = 0;
                        soma = 0;
                    } else {
                        trueOrFalse = 1;
                    }
                }
            }
        }

        if (trueOrFalse == 1) {
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }
}