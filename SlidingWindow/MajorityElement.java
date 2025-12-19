class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        //  hashMap for storing freq
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        // then iterating on the map and returning elemnent whose fre is greater the n/2
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>(n/2)){
            max=entry.getKey();
            }
        }
        return max;
    }
}