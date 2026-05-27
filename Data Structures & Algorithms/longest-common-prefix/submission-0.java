class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int len = strs.length;
        if(len==1) return strs[0];
        int minLength = Integer.MAX_VALUE;
        for(String s : strs){
            minLength=Math.min(minLength,s.length());
        }
        
        String initialStr = strs[0];
        for(int i =0;i<minLength;i++){
            for(int j =1;j<len;j++){
                if(initialStr.charAt(i)!=strs[j].charAt(i)){
                    return ans;
                }
            }
            ans+=initialStr.charAt(i);
        }
        return ans;
    }
}