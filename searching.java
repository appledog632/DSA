import java.util.ArrayList;

public class searching {
    public static ArrayList<Integer> sortedMatrix(int[][] arr,int key)
    {
          ArrayList<Integer> list = new ArrayList<>(); 
          int diff = Math.min(key - arr[0][arr.length-1],key - arr[arr.length-1][0]);
          if(key - arr[0][arr.length-1] == diff)
          {
                int row=0;
                int col =arr[0].length -1;
                while(row<=arr.length -1 && col >=0)
                {
                      if(arr[row][col] > key)
                      {
                            col--;
                      }
                      else if(arr[row][col]<key)
                      {
                            row++;
                      }
                      else{
                            list.add(row);
                            list.add(col);
                            return list;
                      }
                }
          }
          else{
                int row=arr.length-1;
                int col =0;
                while(row<=arr.length -1 && col >=0)
                {
                      if(arr[row][col] > key)
                      {
                            row--;
                      }
                      else if(arr[row][col]<key)
                      {
                            col++;
                      }
                      else{
                            list.add(row);
                            list.add(col);
                            return list;
                      }
                }
          }
          System.out.println("Not found");
          return list;
    }
          
    
    public static void main(String args[])
    {
          int[][] arr={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
          int key =10;
          ArrayList<Integer> list = new ArrayList<>();
          list =sortedMatrix(arr,key);
          System.out.println(list.get(0)+" "+list.get(1));
    }
}
