class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int n=arr.length;
        int i=0;
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        int l=(i+1)%n;
        int r=i;
        while(l!=r){
            if(arr[l]+arr[r]==target){
                return true;
            }
            if(arr[l]+arr[r]<target){
                l=(l+1)%n;
            }else{
                r=(r-1+n)%n;
            }
        }
        return false;
    }
}