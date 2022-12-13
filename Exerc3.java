import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //definindo o numero de linhas e colunas
        System.out.println("Digite a quantidade de linhas e colunas: ");
        int lc = sc.nextInt();
        int[][] matriz = new int[lc][lc];

        //inserindo os valores na matriz
        for (int i = 0; i < lc; i++) {
            for (int j = 0; j < lc; j++) {
                System.out.println("Digite valor da linha " + i + " e coluna " + j + ": ");
                int valor = sc.nextInt();
                matriz[i][j] = valor;
            }
        }

        //percorrendo e somando os valores do traço da matriz
        int soma = 0;
        for (int i = 0; i < lc; i++) {
            for (int j = 0; j < lc; j++) {
                if (i == j){
                    int valorMatriz = matriz[i][j];
                    soma += valorMatriz;
                }
            }
        }
        System.out.println(soma);
    }
}
