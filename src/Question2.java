import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrada: ");
        String input = scanner.next();
        scanner.close();

        String special = "!@#$%^&*()-+";
        int count = 0; // Esta variável será utilizada para contar os critérios atendidos mediante senha informada
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (char i : input.toCharArray() ) {
            /** 
             * 
             * Utilização do foreach para percorrer a string de input, que foi transformada
             * em um array de chars para permitir a utilização do foreach.
             * 
            **/

            /**
             * Abaixo estão todos os if's para verificação de cada critério de senha forte.
             * Para cada critério cumprido é somando 1 ao contador.
             * O contador será utilizado para informar os caracteres faltantes para o cumprimento de todas as regras.
             */
            if (!hasUpper && Character.isUpperCase(i)) {
                hasUpper = true;
                count++;
            }
            if (!hasLower && Character.isLowerCase(i)) {
                hasLower = true;
                count++;    
            }
            if (!hasNumber && Character.isDigit(i)) {
                hasNumber = true;
                count++;
            }
            if (!hasSpecial) {
                for (char j : special.toCharArray()) {
                    if (i == j) {
                        hasSpecial = true;
                        break;
                    }
                }
                if (hasSpecial) {
                    count++;
                }
            }
        }
        count = 4 - count;
        if(input.length() + count < 6){
            count +=  6 - (input.length() + count);
            // Cálculo para contabilizar a quantidade de caracteres faltantes com base na quantidade de critérios atendidos
        }
        System.out.println(count);
    }
}