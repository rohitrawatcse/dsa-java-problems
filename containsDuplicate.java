class Solution {
    public boolean containsDuplicate(int[] nums) {
        //  Arrays.sort(nums);
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1]) return true;
        // }
        // return false;
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            if (!set.add(num)) return true;
        }
        return false;
    }
}
