class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int x : nums){
            if(count == 0){
                element = x;
                count++;
            }else{
                if(x==element){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return element;
    }
}