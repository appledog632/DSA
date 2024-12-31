public class InsertionSortt
{
      public static void Insertionsort(int[] arr)
      {
            for(int i=0;i<arr.length;i++)
            {
                  int j=i;
                  while(j>0 && arr[j-1]>arr[j])
                  {
                        int temp =arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                        j--;
                  }
            }
            for(int i=0;i<arr.length;i++)
            {
                  System.out.print(arr[i]+" ");
            }
            
      }
	public static void main(String[] args) {
		int[] arr= {99,45,72,1099,3,23,22,92};
		 Insertionsort(arr);
	}
}