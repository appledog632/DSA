import java.util.Scanner;
public class shortestDistance {
    public static void Distance(String str)
    {
        int x=0;
        int y=0;
        for(int i =0 ; i<str.length() ; i++)
        {
            if(str.charAt(i)== 'E')
            {
                x=x+1;
            }
            else if(str.charAt(i) == 'W')
            {
                x=x-1;
            }
            else if( str.charAt(i) == 'N')
            {
                y +=1;
            }
            else if (str.charAt(i) == 'S')
            {
                y -=1; 
            }
            else
            {
                System.out.println("Not Possible");
                return;
            }
        }
        double distance =0;
        distance = Math.sqrt((x*x + y*y));
        System.out.println(distance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toUpperCase();
        Distance(str);
        sc.close();
    }
}
