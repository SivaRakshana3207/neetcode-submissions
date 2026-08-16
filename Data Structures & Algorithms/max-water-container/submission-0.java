class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;

        int res = 0;

        while(left<=right){
            int height = Math.min(heights[left],heights[right]);
            int ans = (right-left)*height;
            res = Math.max(res,ans);
            
            if(heights[left]<heights[right]){
                left++;
            } else{
                right--;
            }
        }
        return res;
    }
}
