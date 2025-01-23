import java.util.Arrays;
public class Anagramss
{
    public static void anagram(String s1, String s2)
    {
        s1.toLowerCase();
        s2.toLowerCase();
        if(s1.length() == s2.length ())
        {
            char[] str1 = s1.toCharArray();
            char[] str2 = s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            if(Arrays.equals(str1,str2))
            {
                System.out.println("yes they are  anagrams");
                return;
            }
            else
            {
                System.out.println("Not anagrams ");
                return;
            }
        }
        else
        {
            System.out.println("NOt anagrams of each other");
            return;
        }
    }
	public static void main(String[] args) {
		String str1 = "race";
		String str2 ="care";
		anagram(str1,str2);
	}
}