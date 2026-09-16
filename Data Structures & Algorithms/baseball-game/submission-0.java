class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> st = new Stack<>();
        for(String x : operations){
            if(x.equals("+")){
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                int res = a+b;
                st.push(res);
            }else if(x.equals("D")){
                int a = st.peek();
                st.push(a*2);
            }else if(x.equals("C")){
                int a = st.pop();
            }else{
                st.push(Integer.parseInt(x));
            }
        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}