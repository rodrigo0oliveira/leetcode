class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        char vector [] = s.toCharArray();

        for(int i = 0;i<vector.length-1;i++){
            sum += Math.abs(((int) vector[i] - (int) vector[i+1]));
        }

        return sum;
    }
}