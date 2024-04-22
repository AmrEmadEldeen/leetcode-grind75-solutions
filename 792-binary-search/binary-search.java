class Solution {
    public int search(int[] nums, int target) {
                int result = -1;
        int max = nums.length-1;
        int mid = max/2;
        if (target <= nums[mid] && target >= nums[0]){
            for (int i = 0; i <= mid; i++){
                if (target == nums[i]){
                    result = i;
                }
            }
        }
        else if (target > nums[mid] && target <= nums[max]){
            for (int i = mid+1; i <= max; i++){
                if (target == nums[i]){
                    result = i;
                }
            }
        }
      /*  else{
            result = -1;
        }*/
        return result;
    }
}