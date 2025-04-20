class Solution {
    public int numRabbits(int[] answers) {
        int total_Rabbits = 0;
        int group_Size = 0;
        int count = 0;
        int group = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int x : answers){
            mp.put(x , mp.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
        group_Size  = entry.getKey()+1;
        count = entry.getValue();
        group = (int)Math.ceil((double)count/group_Size);
        total_Rabbits += (group * group_Size);
       }
    return total_Rabbits;
    }
}