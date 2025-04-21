class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long currentSum = 0;
        long maxSum = 0;
        long minSum = 0;

        for (int diff : differences) {
            currentSum += diff;
            maxSum = Math.max(maxSum, currentSum);
            minSum = Math.min(minSum, currentSum);
        }

        long possibleStartValues = (upper - lower) - (maxSum - minSum) + 1;

        return (int) Math.max(0, possibleStartValues);
    }
}