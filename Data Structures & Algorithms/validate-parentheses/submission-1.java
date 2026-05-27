class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(st.isEmpty() && (ch == ']' || ch == '}' || ch == ')')){
                return false;
            }
            if(ch == '{' || ch == '(' || ch == '['){
                st.push(ch);
            }else if(st.peek()== '(' && ch==')'){
                st.pop();
            }else if(st.peek()== '{' && ch=='}'){
                st.pop();
            }else if(st.peek()== '[' && ch==']'){
                st.pop();
            }else{
                return false;
            }
        }
        return st.size()==0;
    }
}
