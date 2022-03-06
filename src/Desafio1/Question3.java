import java.util.ArrayList;
import java.util.List;
//TODO Finalizar o algoritmo
// Código incompleto
public class Question3 {
    public static void main(String[] args) {

        String input = "pedro";
        List<String> subs = new ArrayList<>();
        char[] inputArray = input.toCharArray();
        System.out.println(new String(inputArray));

        for (int start = 0; start <= input.length(); start++) {
            for (int end = start + 1; end <= input.length(); end++) {
                subs.add(input.substring(start, end));
            }
        }
        System.out.println(subs);
    }

}