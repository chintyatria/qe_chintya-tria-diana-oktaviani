import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 4};
        int[] myArray2 = {1, 3, 5, 10, 16};
        int[] unik1 = cariNomorUnik(myArray1, myArray2);
        System.out.println(Arrays.toString(unik1));

        int[] arr3 = {3, 8};
        int[] arr4 = {2, 8};
        int[] unik2 = cariNomorUnik(arr3, arr4);
        System.out.println(Arrays.toString(unik2));
    }
    public static int[] cariNomorUnik(int[] myArray1, int[] myArray2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num1 : myArray1) {
            boolean ditemukan = false;
            for (int num2 : myArray2) {
                if (num1 == num2) {
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                list.add(num1);
            }
        }
        int[] unik = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            unik[i] = list.get(i);
        }
        return unik;
    }
}