class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int column = board[0].length;
        Map<String,Set<Character>> boardMap = new HashMap<>();
         for(int i = 0 ; i<9;i+=3){
            for(int j = 0;j<9;j+=3){
                Set<Character> threeByThreeSet = new HashSet<>();
                // System.out.println(i+"  "+j);
                for(int k =0;k<3;k++){
                    for(int l = 0;l<3;l++){
                        int ridx = i+k;
                        int cidx = j+l;
                        if(board[ridx][cidx]!='.'){
                            char ch = board[ridx][cidx];
                            if(threeByThreeSet.contains(ch)) return false;
                            else threeByThreeSet.add(ch);
                            Set<Character> rSet = boardMap.get("r"+ridx);
                            Set<Character> cSet = boardMap.get("c"+cidx);
                            if(rSet!=null){
                                if(rSet.contains(ch)){
                                    return false;
                                }else{
                                    rSet.add(ch);
                                }
                            }else{
                                rSet = new HashSet<>();
                                rSet.add(ch);
                                boardMap.put("r"+ridx,rSet);

                            }
                            if(cSet!=null){
                                if(cSet.contains(ch)){
                                    return false;
                                }else{
                                    cSet.add(ch);
                                }
                            }else{
                                cSet = new HashSet<>();
                                cSet.add(ch);
                                boardMap.put("c"+cidx,cSet);

                            }
                        }
                        // System.out.println(boardMap);    
                    }
                }
            }
        }
        return true;
    }
}
