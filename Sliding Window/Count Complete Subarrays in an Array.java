class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int completeSubArrayCount = 0;
        Set<Integer> allDistinct = new HashSet<>();
        for(int num : nums){
            allDistinct.add(num);
        }

        int totalSize = allDistinct.size();
        int left = 0;
        int right = 0;

        Map<Integer,Integer> mp = new HashMap<>();

        while(right < nums.length){
            mp.put(nums[right], mp.getOrDefault(nums[right], 0)+1);
            
            while(mp.size() == totalSize){
                completeSubArrayCount += (n - right);
                mp.put(nums[left] , mp.get(nums[left]) - 1);
                if(mp.get(nums[left]) == 0){
                    mp.remove(nums[left]);
                }
                left++;
            }
            right++;
        }
        return completeSubArrayCount;
    }
}