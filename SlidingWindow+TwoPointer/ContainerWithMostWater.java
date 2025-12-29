class RecusriveBinarySearch{
public static int BinarySearch(int arr[],int left,int right,int target){ 
    if(left>right){
  return -1;
    }
    int mid=left+(right-left)/2;
    if(arr[mid]==target){
        return mid;
    }
    else if(arr[mid]<target){
         BinarySearch(arr,mid+1,right,target);
    }
    
       return  BinarySearch(arr,left,mid-1,target);
    

}
    public static void main(String args[]){
    int arr[]={1,2,3,4,5,6};
    int left=0;
    int right=arr.length-1;
    int target=6;
    int res=BinarySearch(arr,left,right,target);
    System.out.println((res==-1) ? "Element is not found" :
    "Element is found at "+res);
    }
}