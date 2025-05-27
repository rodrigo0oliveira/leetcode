/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int lower = 1;
        int higher = n;
        

        while(lower<=higher){
            int myNumber =  lower + (higher - lower) / 2;

            int response = guess(myNumber);

            if(response == -1){
                higher = myNumber-1;
            }else if(response == 1){
                lower = myNumber+1;
            }else if(response==0){
                return myNumber;
            }
            myNumber = (lower + higher)/2;
        }

        return 0;
    }
}