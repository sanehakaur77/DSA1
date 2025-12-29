class Solution {
    public int countNegatives(int[][] grid) {
        //  time complexity-O(N^2)
        // int count=0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(grid[i][j]<0){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // Binary Search
        int rows=grid.length;
        int cols=grid[0].length;
        int count=0;
        for(int i=0;i<rows;i++){
            int left=0,right=cols-1;
            int firstNeg=cols;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(grid[i][mid]<0){
                firstNeg=mid;
                right=mid-1;
                }
                else{
                left=mid+1;
                }
            }
            count+=(cols-firstNeg);
        }
        return count;
    }
}