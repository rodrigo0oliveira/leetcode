class Solution {

    public int search(int[] nums, int target) {
        int baixo = 0;
        int alto = nums.length - 1;

        while(baixo<=alto){
            int meio = (baixo + alto) / 2 ;
            if(nums[meio]==target){
                return meio;
            }
            else if(nums[meio]<target){
                baixo++;
            }
            else{
                alto--;
            }
        }
        return -1;
}
}