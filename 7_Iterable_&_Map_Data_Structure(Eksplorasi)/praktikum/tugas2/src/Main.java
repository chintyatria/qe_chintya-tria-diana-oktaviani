import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input1 = "76523752";
        List<Integer> unique1 = cariNomorUnik(input1);
        System.out.println(unique1);

        String input2 = "1122";
        List<Integer> unique2 = cariNomorUnik(input2);
        System.out.println(unique2);
    }
    public static List<Integer> cariNomorUnik(String input) {
        List<Integer> unique = new ArrayList<Integer>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (input.indexOf(current) == input.lastIndexOf(current)) {
                unique.add(Character.getNumericValue(current));
            }
        }
        return unique;
    }
}