class Solution {
    class Pair {
        int abs;
        List<Integer> val;
        Pair(int abs, List<Integer> val) {
            this.abs = abs;
            this.val = val;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Arrays.sort(arr);
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int abs = Math.abs(arr[i] - x);
            if (map.get(abs) == null) {
                map.put(abs, new ArrayList(Arrays.asList(arr[i])));
            } else {
                List<Integer> ans = map.get(abs);
                ans.add(arr[i]);
            }
        }

        Map<Integer, List<Integer>> res = new TreeMap<>(map);
        List<Integer> ans1 = new ArrayList<>();
        System.out.println(res);
        System.out.println("=======");
        for (Map.Entry<Integer, List<Integer>> pair : res.entrySet()) {
            int len = pair.getValue().size();
            System.out.println(pair + "=="+ len +"==="+ k);
            if(len<k){
                ans1.addAll(pair.getValue());
                k=k-len;
            }else if(len>k){
                int n = k;
                for(int i = 0; i< n;i++){
                    ans1.add(pair.getValue().get(i));
                    k--;
                } 
            }else{
                ans1.addAll(pair.getValue());
                k=0;
            }

            if(k==0){
                break;
            }
            
        }
        // System.out.println(ans1);
        Collections.sort(ans1);

        return  ans1;
    }
}