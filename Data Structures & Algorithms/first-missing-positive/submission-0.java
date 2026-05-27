class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing = 1;
        for(int n : nums){
            if(n>0 && n!=missing && n>missing){
                return missing;
            }
            else if(n>0 && n==missing){
                missing++;
            }
            else if(n>0 && n<missing){
                continue;
            }
        }
        return missing;
    }
}