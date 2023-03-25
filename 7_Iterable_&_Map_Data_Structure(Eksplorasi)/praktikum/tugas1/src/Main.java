import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] myArray1 = {"kazuya", "jin", "lee"};
        String[] myArray2 = {"kazuya", "feng"};
        String[] merged = mergeArray(myArray1, myArray2);
        System.out.println(Arrays.toString(merged));

        String[] arr3 = {"lee", "jin"};
        String[] arr4 = {"kazuya", "panda"};
        String[] merged2 = mergeArray(arr3, arr4);
        System.out.println(Arrays.toString(merged2));
    }
    public static String[] mergeArray(String[] myArray1, String[] myArray2) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(myArray1));
        for (String name : myArray2) {
            if (!list.contains(name)) {
                list.add(name);
            }
        }
        return list.toArray(new String[0]);
    }
}