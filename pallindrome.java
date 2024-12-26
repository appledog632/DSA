class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int num = x;
        if(x<0)
        {
            return false;
        }
        while(x !=0)
        {
            int temp = x%10;
            res = res*10+temp;
            x = (x-temp)/10;
            
            if(res%10!=temp) 
            {
                return false;
            }
        }
        if(num == res)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
