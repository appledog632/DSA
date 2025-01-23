public class compressio
{
    public static void compress(String str)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i =0 ; i< str.length(); i++)
        {
            Integer count=1 ;
            while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1) )
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1)
            {
                count.toString();
                sb.append(count);
            }
        }
        System.out.print(sb);
        return;
    }
	public static void main(String[] args) {
	    String str = "abcd";
		compress(str);
	}
}
