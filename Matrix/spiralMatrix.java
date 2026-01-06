class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      ArrayList<Integer> ans=new ArrayList<>();
     int n=matrix.length;// rows
     int m=matrix[0].length;//  columns
     int bottom=n-1; //  last row
     int right=m-1; //  last column
     int top=0;
     int  left=0;
     while(left<=right && top<=bottom){
        //  from left to right
        for(int i=left;i<=right;i++){
         ans.add(matrix[top][i]);
        }
        top++;
        // from right to bottom
        for(int i=top;i<=bottom;i++){
            ans.add(matrix[i][right]);
        }
        right--;
        // from right to left
        if(top<=bottom){ // To avoid printing the same row twice when only one row is left.
        for(int i=right;i>=left;i--){
        ans.add(matrix[bottom][i]);
        }
        bottom--;
        }
        // from bottom to top
       if(left<=right){ //  To avoid printing the same column twice when only one column is left.
         for(int i=bottom;i>=top;i--){
            ans.add(matrix[i][left]);
        }
        left++;
       }
     }
     return ans;
     
    }
}