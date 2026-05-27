class Solution {
    public boolean validPalindrome(String s) {
        
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
            return isPalindrome(s.substring(0,i)+s.substring(i+1))
                ||
                isPalindrome(s.substring(0,j)+s.substring(j+1));
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(String s){
        int l =0;
        int r = s.length()-1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}