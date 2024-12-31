public class bubblesortt
{
      public static void Bubblesort(int[] arr)
      {
            for(int i=0;i<arr.length;i++)
            {
                  for(int j=0;j<arr.length-1-i;j++)
                  {
                        if(arr[j]>arr[j+1])
                        {
                              int temp= arr[j];
                              arr[j]=arr[j+1];
                              arr[j+1]=temp;
                        }
                        
                  }
            }
            for(int i=0;i<arr.length;i++)
            {
                  System.out.print(arr[i]+" ");
            }
            
      }
	public static void main(String[] args) {
		int[] arr= {99,45,72,1099,3,23,22,92};
		 Bubblesort(arr);
	}
}