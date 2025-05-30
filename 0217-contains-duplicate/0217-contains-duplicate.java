class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
            }
            hash.add(nums[i]);
        }
        return false;
    }
}