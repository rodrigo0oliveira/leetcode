class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<Integer,Boolean>(nums.length);

        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.replace(nums[i],false);
            }else{
                map.put(nums[i],true);
            }
        }

        for(Map.Entry<Integer,Boolean> entry:map.entrySet()){
            if(entry.getValue()==true){
                return entry.getKey();
            }
        }
        
        return 0;
    }
}