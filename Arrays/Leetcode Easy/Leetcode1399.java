class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1); 
        }

        int maxSize = 0;
        for (int count : map.values()) {
            maxSize = Math.max(maxSize, count);
        }

        int res = 0;
        for (int count : map.values()) {
            if (count == maxSize) {
                res++;
            }
        }

        return res;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
