class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size = nums.length;
        Set<Integer> temp = new HashSet<>();

        for( int i = 0; i < size ; i++){
            if(temp.contains(nums[i]))
                return true;
            else{
                temp.add(nums[i]);
            }
        }

        return false;
    }
}