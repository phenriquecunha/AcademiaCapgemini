import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        /**
         * Retirando os espaços com replace().
         */
        input = input.replace(" ", "");

        /**
         * Lista para guardar as substrings que foram divididas pela raiz quadrade da string
         */
        List<String> subs = new ArrayList<>();

        String finalStr = "";


        /**
         * Cáculo da raiz quadrada arredondado para cima
         */
        int raizInput = (int) Math.ceil(Math.sqrt(input.length())); 
        

        /**
         * Dividindo as substrings(linhas do grid) com base na raiz quadrada do tamanho da string
         */
        for (int start = 0; start <= input.length(); start += raizInput) {
            if(start+raizInput > input.length()){
                subs.add(input.substring(start, start+(input.length()) - start));
            }
            else 
                subs.add(input.substring(start, start+raizInput));
        }


        /**
         * Juntando as colunas do grid para formar a string final de acordo com os critérios
         */
        for (int i = 0; i < subs.size(); i++) {
            for (int j = 0; j < raizInput; j++) {
                
                if(subs.get(j).length() > i){
                    finalStr += subs.get(j).toCharArray()[i];
                }
            }
            finalStr += " ";
        }

        /**
         * Impressão da String final encriptada
         */
        System.out.println(finalStr);
    }

}
