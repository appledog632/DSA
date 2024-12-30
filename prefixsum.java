public class prefixsum
{
      public static void PrefixSum(int arr[])
      {
            int[] Prefix = new int[arr.length];
            Prefix[0]=arr[0];
            for(int i=1;i<arr.length;i++)
            {
                  Prefix[i]= arr[i]+ Prefix[i-1];
            }
            int currsum=0;
            int maxsum=0;
            for(int i=0;i<arr.length;i++)
            {
                  for(int j=i;j<arr.length;j++)
                  {
                        currsum = (i == 0) ? Prefix[j] : Prefix[j] - Prefix[j - 1];
                  }
                  if(currsum>maxsum)
                  {
                        maxsum=currsum;
                  }
            }
            System.out.println(maxsum);
      }
	public static void main(String[] args) {
		int arr[]={1,-2,6,-1,3};
		PrefixSum(arr);
	}
}