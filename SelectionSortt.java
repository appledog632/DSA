public class SelectionSortt
{
      public static void Selectionsort(int[] arr)
      {
            for(int i=0;i<arr.length;i++)
            {
                  int pos=i;
                  for(int j=i;j<arr.length;j++)
                  {
                        if(arr[j]<arr[pos])
                        {
                              pos=j;
                        }
                  }
                  int temp=arr[i];
                  arr[i]=arr[pos];
                  arr[pos]=temp;
            }
            for(int i=0;i<arr.length;i++)
            {
                  System.out.print(arr[i]+" ");
            }
            
      }
	public static void main(String[] args) {
		int[] arr= {99,45,72,1099,3,23,22,92};
		 Selectionsort(arr);
	}
}