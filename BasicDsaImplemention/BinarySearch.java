class BinarySearch{
    public static int BinarySearch(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int target=5;
         int index=BinarySearch(arr,target);
         System.out.println(index==-1 ? "Element is not found":"Element is found at index "+index);
    }
}