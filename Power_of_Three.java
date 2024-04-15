class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0 || n < 0){
             return false;
        }
        if(n == 1) return true;
        boolean check = false;
        boolean flag = true;
        while(flag){
           if(n % 3 == 0){
             check = true;
             n = n/3;
             if(n == 1){
                flag = false;
                break;
             }
           }
           else{
                  flag = false;
                  check = false;
                  break;
           }
        }
        if(check) return true;
        else return false;
    }
}