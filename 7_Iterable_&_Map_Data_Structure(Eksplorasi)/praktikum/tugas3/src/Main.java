import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] indices1 = cariKecocokan(nums1, target1);
        System.out.println(Arrays.toString(indices1));

        int[] nums2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] indices2 = cariKecocokan(nums2, target2);
        System.out.println(Arrays.toString(indices2));
    }
    public static int[] cariKecocokan(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}