// Brute-Force Approach
 /* public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
    long ans = 0;
   for(int i=0;i<nums.size();i++){
        for(int j=i;j<nums.size();j++){
            int cnt = 0;
            for(int x=i;x<=j;x++){
                if(nums.get(x) % modulo == k) cnt++;
            }
            if(cnt % modulo == k) ans++;
        }
    }
    return ans;
}
*/


//Optimal Approach

public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
    int n = nums.size();
    Map<Integer, Long> mp = new HashMap<>(); // remainder -> count
    long sum = 0;
    long result = 0;

    mp.put(0, 1L);

    for (int i = 0; i < n; i++) {
        if (nums.get(i) % modulo == k) {
            sum += 1;
        }

        int r1 = (int)(sum % modulo);
        int r2 = (r1 - k + modulo) % modulo;

        result += mp.getOrDefault(r2, 0L);
        mp.put(r1, mp.getOrDefault(r1, 0L) + 1);
    }

    return result;
}
