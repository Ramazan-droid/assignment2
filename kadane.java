public class kadane {
    public static int[] kadaneAlgorithmWithPosition(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        return new int[] { maxSum, start, end };
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = kadaneAlgorithmWithPosition(arr);
        System.out.println("Maximum Sum: " + result[0]);
        System.out.println("Subarray starts at index " + result[1] + " and ends at index " + result[2]);
    }
}