// T.C = O(N)
// S.C = O(1)

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int minPosition = -1;  
        int maxPosition = -1;   
        int badPosition = -1;   
        
        long count = 0;
        
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num < minK || num > maxK) {
                badPosition = i;
            }
            
            if (num == minK) {
                minPosition = i;
            }
            
            if (num == maxK) {
                maxPosition = i;
            }
            
            int validStart = Math.min(minPosition, maxPosition);
            
            if (validStart > badPosition) {
                count += validStart - badPosition;
            }
        }
        
        return count;
    }
}
