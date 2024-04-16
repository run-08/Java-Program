class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        while(!(n <= 0)){
          if(n%4 == 0){
            n = n/4;
            continue;
          }
          else{
            break;
          }
        }
        return n == 1;
    }
}