class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i] > nums[j]) {
                    result[i]++;
                }
            }
        }
        return result;
    }
}


// Input: nums = [8,1,2,2,3]
//               [1,2,2,3,8]
// Output:       [4,0,1,1,3]
//               []