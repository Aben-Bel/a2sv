class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        
        for(int i=0;i<points.length;i++){
            int min=i;
            for(int j=i+1;j<points.length;j++){
                double dis1 = Math.sqrt(points[j][0]*points[j][0] + points[j][1]*points[j][1]);
                double dis2 = Math.sqrt(points[min][0]*points[min][0] + points[min][1]*points[min][1]);
                if(dis2 > dis1) {
                    min = j;
                }
            }
            int[] temp = points[i];
            points[i] = points[min];
            points[min] = temp;
        }
        
        for(int i=0;i<k;i++){
            res[i]=points[i];
        }
        return res;
    }
}