class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        Arrays.sort(nums);
        return helper(nums,upper+1)- helper(nums,lower);
    }
    private long helper(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int sum =0;
        long ans =0l;
        while(l < r){
            sum = nums[l] + nums[r];
            if(sum < target){
                ans += (r-l);
                l++;
            }
           else{
            r--;
           }
        }
        return ans;
    }
}