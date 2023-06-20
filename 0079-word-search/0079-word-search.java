class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] check=new boolean[board.length][board[0].length];
        boolean ans=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    ans=checkispresent(board,word,i,j,0,check);
                    if(ans==true){
                        return ans;
                    }
                }
            }
        }
        return ans;
        
    }
    
    public static boolean checkispresent( char[][] board , String word , int i , int j, int idx , boolean[][] calldone ){      
        if( idx==word.length()){
            return true;
        } 
        
        if( i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!= word.charAt(idx) || calldone[i][j]  ) return false;
        
        
            calldone[i][j]=true;
            
            boolean a1=checkispresent( board , word , i , j+1, idx+1 , calldone );
            boolean a2=checkispresent( board , word , i+1 ,j , idx+1 , calldone );
            boolean a3=checkispresent( board , word , i , j-1, idx+1 , calldone );
            boolean a4=checkispresent( board , word , i-1 , j, idx+1 , calldone );         
            calldone[i][j]=false;
            return a2||a1||a3||a4;
        }
}