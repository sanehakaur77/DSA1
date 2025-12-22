class Solution {
    public int maxProduct(int[] nums) {
        int preFix=1;
        int suffix=1;
        int n=nums.length;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            //  agar prfeix ka yani ki age se multiply karte ayege to oagar bich me zero aya to vo sare subarray ke prduct ko zero kardega
            if(preFix==0){
                preFix=1;
            }
             //  agar suffix ka yani ki age se multiply karte ayege to oagar bich me zero aya to vo sare subarray ke prduct ko zero kardega
            if(suffix==0){
                suffix=1;
            }
            // yeh agaye se multiply kar raha hai elements ko 
            preFix=preFix*nums[i];
            // yeh piche se multiply kar raha hai elements ko 
            suffix=suffix*nums[n-i-1];
            // dono me se jo bhi maximum aya vo vo maxProduct hi hogaa...
        maxProduct=Math.max(maxProduct,Math.max(preFix,suffix));
        }
        return maxProduct;

    }
}