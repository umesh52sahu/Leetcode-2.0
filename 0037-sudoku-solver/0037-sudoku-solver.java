class Solution {
    public void solveSudoku(char[][] board) {
        positive=false;
        printans(board,0,0);
    }
    
    public static void print(char[][] board){

        for(char[] arr:board){
            for(char ch:arr){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static boolean positive=false;
    public static void printans(char[][] board,int r,int c){
        if(c==9){
            r++;
            c=0;
        }
        
        if(r==9){
            print(board);
            positive=true;
            return;
        }
        
        if(board[r][c]!='.'){
            
            printans(board,r,c+1);
        
        }else{
            
            for(char i='1';i<='9';i++){
                if(issafe(board,r,c,i)){
                        board[r][c]=i;
                        printans(board,r,c+1);
                        if(positive){   
                                return;
                        }
                }
            }
                board[r][c]='.';
        } 
    }
    public static boolean issafe(char[][] board,int r,int c,char digits){
        for (int R = 0; R < 9; R++) {
			if (board[R][c] == digits) {
				return false;
			}
		}
		for (int C = 0; C < 9; C++) {
			if (board[r][C] == digits) {
				return false;
			}
		}

        int boxr=r/3;
        int boxc=c/3;
        for(int R = boxr * 3 ; R < boxr * 3 + 3 ; R++){
            for(int C= boxc * 3 ; C < boxc * 3 + 3 ; C++){
                if( digits == board[R][C]){
                    return false;
                }
            }
        }
        return true;
    }
}