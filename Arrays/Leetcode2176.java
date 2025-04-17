public class Leetcode2176 {
        public int countPairs(int[] nums, int k) {
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j] && ((i * j) % k) == 0)
                        count++;
                }
            }
            return count;
        }
    public static void main(String[] args) {
        Leetcode2176 sol = new Leetcode2176();
        int[] nums = {3, 1, 2, 2, 2, 1, 3};
        int k = 2;
        System.out.println(sol.countPairs(nums,k));
    }
}