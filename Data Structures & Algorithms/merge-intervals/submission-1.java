class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 0; i < in.length; i++) {
            int ns = in[i][0];
            int ne = in[i][1];

            if(ans.isEmpty() ||  ans.get(ans.size()-1)[1] < ns){
                ans.add(in[i]);
            }else{
                int [] temp = ans.get(ans.size()-1);
                temp[1] = Math.max(ans.get(ans.size()-1)[1],in[i][1]);
            }

        }
        return ans.toArray(new int[ans.size()][]);
    }
}
