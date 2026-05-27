class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> scount = new HashMap<>();
        for(int i=0;i<s.length();i++){
            scount.put(s.charAt(i),scount.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(scount);
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(scount.get(ch)==null) return false;
            int val = scount.get(ch)-1;
            scount.put(ch,val);
            if(val==0) scount.remove(ch);
        }
        System.out.println(scount);
        return scount.size()==0;
    }
}
