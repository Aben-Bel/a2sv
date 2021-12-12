class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int[] counts = new int[101];
        
        for(int i=0;i<nums.length;i++){
            counts[nums[i]]++;
        }
        
        int countStart = 0;
        for(int i=0;i<counts.length;i++){
            if(i == target) break;
            countStart += counts[i];
        }
        
        int countEnd = countStart + counts[target];
        
        List<Integer> res = new ArrayList<>();
        
        for(int i=countStart;i<countEnd;i++){
            res.add(i);
        }
        return res;
        
    }
}