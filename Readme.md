# Assignment2

## Kadane's Algorithm with subarray Indices(Java)
This project implements Kadane’s Algorithm in Java.
It finds the maximum sum of a contiguous subarray in a given integer array and also returns the start and end indices of that subarray.

## Problem Statement
Given an array of integers (which may include negative numbers), find the subarray with the maximum sum and return:

1.The maximum sum

2.The starting index of the subarray

3.The ending index of the subarray

## Algorithm Used:
This code uses Kadane’s Algorithm, a dynamic programming approach that:

1.Iterates through the array once (O(n) time complexity).

2.Keeps track of the current subarray sum.

3.Resets the sum when it becomes negative.

4.Updates the maximum sum and subarray indices whenever a new maximum is found.

## Code
```java
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
```