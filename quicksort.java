public class quicksort
{
      public static int Partition(int[] arr, int low , int high)
      {
            int pivot = arr[low];
            int i= low;
            int j= high;
            System.out.println(low);
            System.out.println(high);
            while(i<j)
            {
                  while(arr[i]<= pivot && i<high)
                  {
                       i++; 
                  }
                  while( arr[j]> pivot && j>= low+1)
                  {
                        j--;
                  }
                  if (i < j){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                  }
            }
            arr[low] = arr[j];
            arr[j] = pivot;
            return j;
      }
      public static void QuickSort(int[] arr , int low, int high)
      {
            if(low >= high)
            {
                  return;
            }
            int PIndex =Partition(arr,low,high);
            QuickSort(arr, low, PIndex-1);
            QuickSort(arr, PIndex+1 ,high);
            
      }
      public static void main(String args[])
      {
            int arr[]={5,9,3,1,2};
            QuickSort(arr,0,arr.length-1);
            for(int i=0;i< arr.length;i++)
            {
                  System.out.print(arr[i]+" ");
            }
      }
}