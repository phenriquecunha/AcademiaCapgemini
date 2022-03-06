import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a string: ");
        String input = scanner.next();
        scanner.close();

        List<String> subs = new ArrayList<>(); // Lista para guardar as substrings

        for (int start = 0; start <= input.length(); start++) {
            /**
             * Laço para separar todas as possíveis substrings e
             * guardar-las na lista.
             */
            for (int end = start + 1; end <= input.length(); end++) {
                subs.add(input.substring(start, end));
            }
        }

        for (int i = 0; i < subs.size(); i++) {
            /**
             * Laço para verificar a existência de anagramas na lista de subtrings.
             * OBS: Utilizei a estatégia de ordenar as substrings em ordem alfabética e verificar se são iguais, já que anagramas sempre possuem as mesmas letras.
             */
            char[] tmpStr = subs.get(i).toCharArray();
            for (int j = i+1; j < subs.size(); j++) {
                char[] tmpStr2 = subs.get(j).toCharArray();
                Arrays.sort(tmpStr);
                Arrays.sort(tmpStr2);

                if(Arrays.toString(tmpStr).equals(Arrays.toString(tmpStr2))) {
                    count++;
                    // Caso sejam iguais, são anagramas, adicionando assim +1 ao contador.
                }
            }
        }
        System.out.println(count);
    }

}