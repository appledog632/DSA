import java.util.Arrays;
public class Anagramss
{
    public boolean isAnagram(String s, String t) {
        int p =s.length();
        int q =t.length();
        if(p == q){
            int[] c = new int[26];
            for(int i=0; i< p ; i++ ){
                c[s.charAt(i) - 'a']++;
                c[t.charAt(i) - 'a']--;
            }
            for(int i=0 ;i< 26 ;i++){
                if(c[i]!=0){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    
	public static void main(String[] args) {
		String str1 = "race";
		String str2 ="care";
		System.out.println(isAnagram(str1,str2));
	}
}