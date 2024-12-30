public class reversearray
{
      public static void ReverseArray(int arr[])
      {
            int n= arr.length;
            for(int i=0;i<=n/2;i++)
            {
                  int temp = arr[i];
                  arr[i]= arr[n-1-i];
                  arr[n-1-i]= temp;
            }
            return;
      }
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,55,66,77,88,99,101,111};
		int n =0;
		ReverseArray(arr);
		for(int i=0;i<arr.length;i++)
		{
		      System.out.print(arr[i]+" ");
		}
	}
}