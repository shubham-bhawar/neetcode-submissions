class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = 0 , b  = 0 , c =0 ;
        int j = word1.length()-1;
        int k = word2.length()-1;
        StringBuilder sb = new StringBuilder();
        while(a<=j && b<=k){
            sb.append(word1.charAt(a));
            sb.append(word2.charAt(b));
            a++;
            b++;
        }
        while(a<=j){
            sb.append(word1.charAt(a));
            a++;
        }
        while(b<=k){
            sb.append(word2.charAt(b));
            b++;
        }
    return sb.toString();
    }
}