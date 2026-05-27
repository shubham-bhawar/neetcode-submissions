class Solution {
    public boolean isPalindrome(String s) {
        
        // String[] inputArray = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch>='0' &&ch<='9'))sb.append(s.charAt(i));
        }
        String abc = sb.toString();
        int start = 0 ;
        int end = abc.length()-1;
        System.out.println(abc);
        while(start<end){
            char ch1= abc.charAt(start);
            char ch2= abc.charAt(end);
            if((ch1>='0' && ch1 <='9') || (ch2>='0' && ch2 <='9')){
                if(ch1!=ch2){
                    return false;
                }
                start++;
                end--;
                continue;
            }
            int si = (int)ch1;
            int e = (int)ch2;
            int min = Math.abs(si-e);
            if(!(min==0 || min==32)){
                return false;
            } 
            System.out.println(min);
            start++;
            end--;
        }
        return true;
    }
}
