class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0 , ten = 0 ;
        for(int x : bills){
            if(x==5){
                five++;
            }else if (x == 10){
                ten++;
                if(five<=0){
                    return false;
                }
                five--;
            }else{
                if(ten >0 && five>0){
                    ten--;
                    five--;
                }else if(five>2){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}