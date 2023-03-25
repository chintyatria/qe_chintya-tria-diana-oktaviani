public class Main {
    public static void main(String[] args) {
        int[] myArray1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        int maxSum1 = findMaxSum(myArray1, k1);
        System.out.println(maxSum1);

        int[] myArray2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        int maxSum2 = findMaxSum(myArray2, k2);
        System.out.println(maxSum2);
    }
    public static int findMaxSum(int[] arr, int k) {
        int maxSum = 0;
        int currentSum = 0;
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];
            if (end >= k - 1) {
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= arr[start];
                start++;
            }
        }
        return maxSum;
    }
}