class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        Map<String,ArrayList<String>> resultMap = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            temp.add(str);
            ArrayList<String> var = resultMap.getOrDefault(str,new ArrayList<>());
            var.add(s);
            resultMap.put(str , var);

        }
        // for(Map.Entry<String,ArrayList<String>> entry : resultMap.entrySet()){
        //     ans.add(entry.getValue());
        // }
        return new ArrayList<>(resultMap.values());

    }
}
