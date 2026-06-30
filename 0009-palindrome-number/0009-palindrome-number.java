class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        while(temp > 0) {
            int lastdigit = temp%10;
             rev = (rev*10) + lastdigit;
            temp =  temp/10;
        }
        if(x == rev){
            return true;
        }
        return false;
    }
}