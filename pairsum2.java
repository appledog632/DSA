class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp=0;
        int rp=numbers.length-1;
        int[] result = new int[2];
        while(lp<rp)
        {
            if(numbers[lp]+numbers[rp]==target)
            {
                result[0]=lp+1;
                result[1]=rp+1;
                return result;
            }
            else if(numbers[lp]+numbers[rp]>target)
            {
                rp--;
            }
            else
            {
                lp++;
            }
        }
        result[0]=0;
        result[1]=1;
        return result;
    }
}