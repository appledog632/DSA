public class kadanes
{
      public static void Kadanes(int[] arr)
      {
            int currsum=0;
            int maxsum=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                  currsum+=arr[i];
                  if(currsum<0)
                  {
                        currsum=0;
                  }
                  maxsum= Math.max(currsum,maxsum);     
            }
            System.out.println("MAX SUM : "+maxsum);
      }
	public static void main(String[] args) {
		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		Kadanes(arr);
	}
}