class Solution {
    public boolean isPalindrome(int x) {

        String stringX = String.valueOf(x);
        char [] arrayX = stringX.toCharArray();

        int posicaoFinalArray = arrayX.length-1;

        String inverse = "";

        int decount = posicaoFinalArray;

        for(int i=0;i<=posicaoFinalArray;i++){
            if(arrayX[i]!=arrayX[decount]){
                return false;
            }
            decount-=1;
        }

        return true;
       
        
    }
}