class Solution {
    public int maxArea(int[] height) {
        //optimised
        int n = height.length;
        int maxWater = 0;
        int l = 0, r = n-1;
        while(l<r){
            int leftH = height[l], rightH = height[r]; 
            int minH = (leftH<rightH)? leftH : rightH;
            int area = (r-l)*minH;
            if(area > maxWater) maxWater = area;
            if(leftH < rightH){
                while(l<r && height[l] <= leftH) l++;
            } 
            else{
                while( l < r && height[r]<= rightH) r--;
            }
       }  
       return maxWater;
    }
}