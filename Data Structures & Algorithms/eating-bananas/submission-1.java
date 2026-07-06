class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBanana = 0;
        for (int i = 0; i < piles.length; i++) {
            maxBanana = Math.max(maxBanana, piles[i]);
        }

        int start = 1;
        int end = maxBanana;
        int ans = 0;
        while (start <= end) {
            int hrs=0;
            int mid = (start + end) / 2;

            

            for (int i = 0; i < piles.length; i++) {
                hrs += (int) Math.ceil((double)piles[i]/mid);
                // System.out.print("hrs :- "+hrs +" ***");
            }

            // System.out.println("start :- "+ start +"end :- "+end +"mid :-"+ mid + "hrs :-"+hrs);

            if(hrs <= h){
                end = mid -1 ;
                ans = mid;
            }else{
                start = mid+1;
            }
        }

        return ans;
    }
}
