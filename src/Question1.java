import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 0; i <= n; i++) {
            /**
             *  Laço para imprimir o número de linhas correspondentes o input
             **/
            for (int j = n; j >= 0; j--) {
                char s = j > i ? ' ' : '*';
                System.out.print(s);
                /**
                *  Laço para verificação da linha atual e impressão da quantidade de asteriscos conforme
                *  variável i, que indica a linha atual e preenchimento de espaços ao restante da linha.
                **/
            }
            System.out.println();
            // Pular a linha após cada preenchimento de caracteres
        }
    }
}