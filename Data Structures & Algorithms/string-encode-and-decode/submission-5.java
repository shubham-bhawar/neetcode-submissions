class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        List<Integer> ans = new ArrayList<>();

        for(String s : strs){
            ans.add(s.length());
        }
        for(int size : ans){
            sb.append(size).append(',');
        }
        sb.append('#');
        for(String s : strs){
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#'){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i)!=','){
                sb.append(str.charAt(i));
                i++;
            }
            res.add(Integer.parseInt(sb.toString()));
            i++;    
        }
        i++;
        for(int x : res){
            ans.add(str.substring(i,i+x));
            i+=x;
        }
        return ans;
    }
}
