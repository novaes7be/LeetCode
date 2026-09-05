class Solution {
    public boolean isPalindrome(int x) {
        int invert = 0;
        int number = x;
        
        while(number != 0) {
            int digit = number % 10;
            invert = invert * 10 + digit;
            number /= 10;
        }
        if(x == invert && x >= 0) {
            return true;
        } else {
            return false;
        }
    }
}