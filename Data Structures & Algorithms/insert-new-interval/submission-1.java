class Solution {
    public int[][] insert(int[][] intervals, int[] ne) {
        List<int[]> ans = new ArrayList<>();
        for(int [] arr : intervals){
            if(ne[1] < arr[0] || ne[0] > arr[1] ){
                ans.add(arr);
            }
            else{
               ne[0] = Math.min(ne[0],arr[0]);
               ne[1] = Math.max(ne[1], arr[1]);
            }
        }
        ans.add(ne);
        ans.sort(Comparator.comparingInt(a-> a[0]));
        return ans.toArray(new int[ans.size()][]);
    }
}
