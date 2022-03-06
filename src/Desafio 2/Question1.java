import java.util.Arrays;
import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrInput = null;
        
        try {
            System.out.println("Digite os numeros do array separados por espaço: (Quantidade impar de numeros)");
            String input = scanner.nextLine();    
            scanner.close();         
            
            /**
             * Transformando os números da string em elemetos de um array com uso do split().
             */
            arrInput = input.split(" ");
            

            /**
             * Verificação dd quantidade de números do array, ocasionando em erro(Através do bloco try / catch) 
             * caso a quantidade seja par.
             */
            if (arrInput.length % 2 == 0) throw new Exception(); 

            /**
             * Criando um arry de inteiros a partir do array de string de números, para permitir
             * operações matemáticas.
             */
            int[] arr = new int[arrInput.length];
    
            for (int i = 0; i < arrInput.length; i++) {

                // Alimentando o array de inteiros a partir das String de entrada.
                arr[i] = Integer.parseInt(arrInput[i]);
            }
            
            // Ordenando os números para o cálculo de mediana
            Arrays.sort(arr); 

            // Calculando a mediana e imprimindo o resultado final
            System.out.println("Saida: " + arr[(arr.length -1) / 2]); 

        } catch (Exception e) {
            // Bloco de erro;
            System.out.println("Error: A quatidade de numeros precisa ser impar");
        }

        
    }
}