import java.util.ArrayList;
class mergesort
{
      public static void Merge(int arr[], int low , int mid , int high)
      {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int left=low;
            int right=mid+1;
            while(left<= mid && right<=high)
            {
                  if(arr[left]<=arr[right])
                  {
                       list.add(arr[left]);
                       left++;
                  }
                  else{
                        list.add(arr[right]);
                        right++;
                  }
            }
            while(left<=mid)
            {
                  list.add(arr[left]);
                  left++;
            }
            while(right<=high)
            {
                  list.add(arr[right]);
                  right++;
            }
            for(int i=0;i< list.size() ;i++)
            {
                  arr[i+low]= list.get(i);
            }
            
      }
      public static void MergeSort(int arr[] , int low , int high)
      {
            if(low>=high)
            {
                  return;
            }
            int mid =(low+high)/2;
            MergeSort(arr,low,mid);
            MergeSort(arr,mid+1,high);
            Merge(arr,low,mid,high);
            
      }
      public static void main(String args[])
      {
            int arr[]={33,44,99,23,4572,883,1,228,67};
            MergeSort(arr,0,arr.length-1);
            for(int i=0;i<arr.length;i++)
            {
                  System.out.print(arr[i]+" ");
            }
      }
}