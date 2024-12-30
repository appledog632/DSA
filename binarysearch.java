public class binarysearch
{
      public static void BinarySearch(int arr[], int n)
      {
            int start =0;
            int end= arr.length-1;
            while(start<=end)
            {
                  int mid=(start+end)/2;
                  if(arr[mid]==n)
                  {
                        System.out.println("Found "+arr[mid]+" at "+mid);
                        return;
                  }
                  if(arr[mid]>n)
                  {
                        end=mid-1;
                  }
                  else{
                        start=mid+1;
                  }
            }
            System.out.println("NOT FOUND");
            return;
            
      }
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,55,66,77,88,99,101,111};
		int n =0;
		BinarySearch(arr,n);
	}
}