public class Main {
    public static void main(String[] args) {
        int[] myArray1 = {2, 3, 3, 3, 6, 9, 9};
        int len1 = hapusDuplikasi(myArray1);
        System.out.println(len1);

        int[] myArray2 = {2, 2, 2, 11};
        int len2 = hapusDuplikasi(myArray2);
        System.out.println(len2);
    }
    public static int hapusDuplikasi(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}