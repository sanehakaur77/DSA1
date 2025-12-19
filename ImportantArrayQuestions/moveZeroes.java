class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        if(nums.length==1 && nums[0]==0){
          return ;
        }
        // agar ith element non zero element ko find karega 
        // agar i ko non zero element mil gaya to jth ke element ke sath arr[j] par arr[i]  fill kar fo or j++ karo
        for(int i=0;i<nums.length;i++ ){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        // yeh baki bachi last jagah par zeroes fill karege
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
}