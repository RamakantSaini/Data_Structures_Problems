class Solution {
    public int numRabbits(int[] answers) {
        int[] count = new int[1001];
        for(int num : answers){
            count[num]++;
        }
        int total_Rabbits =0;
        for(int i=0;i<count.length;i++){
            if(count[i] == 0) continue;
            total_Rabbits += Math.ceil((double) count[i]/(i+1)) * (i+1);
        }
        return total_Rabbits;
    }
}