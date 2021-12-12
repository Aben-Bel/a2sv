class Solution {
    public int[][] merge(int[][] intervals) {
        // [[1,3],[2,6],[8,10],[15,18]]
        // s -> [1,6]
        // i1 -> [8,10]
        // r ->[[1,6],[]
        // 
        
        // [1,2,8,15]
        // [3,6,10,18]
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        if(intervals.length == 1) return intervals;
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        int j=0;
        for(int i=1;i<intervals.length;i++){
            int k = i;
            if(intervals[i][0] <= current[1]){
                while(k<intervals.length && intervals[k][0] <= current[1]){
                current = new int[]{Math.min(current[0],intervals[k][0]), 
                                Math.max(current[1],intervals[k][1])
                                };
                k++;
            }
            }else{
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][2]);
    }
}