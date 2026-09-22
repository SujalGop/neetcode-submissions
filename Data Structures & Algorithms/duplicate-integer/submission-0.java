class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        boolean ans = false;
        for(int i = 0; i < n; i++){
            int k = nums[i];
            for(int j = i+1; j < n;j++ ){
                if(nums[j] == k){
                    ans = true;
                    break;
                }
            }
            if(ans){
                break;
            }
        }

        return ans;
    }
}