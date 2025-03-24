class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])){
                list.add(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }

        int[] response = new int[list.size()];

        for(int i = 0;i<response.length;i++){
            response[i] = list.get(i);
        }
        
        return response;
    }
}