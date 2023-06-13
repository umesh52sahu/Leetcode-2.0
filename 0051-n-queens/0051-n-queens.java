class Solution {
    public static List<List<String>> fans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        fans=new ArrayList<>();
        // List<List<String>> ans=new ArrayList<>();
        boolean[][] check=new boolean[n][n];
        place(0,0,n,n,n,"",check);
        return fans;
    }
    public static List<String> print(boolean[][] check){
        List<String> ans=new ArrayList<>();
		for(int i=0;i<check.length;i++){
            String str="";
			for(int j=0;j<check[0].length;j++){
				if(check[i][j]){
                    str=str+"Q";
					// System.out.print("Q");
				} else{
                    str=str+".";
					// System.out.print(".");
				}
			}
            
        ans.add(str);
			System.out.println();
		}
        return ans;
	}



	public static void place(int r, int c, int toPlace, 
			int total_R,int total_C, String path,boolean[][] check) {
		if(toPlace==0) {
			// System.out.println(path);
			fans.add(print(check));
			return;
		}
		
		if(c==check[0].length) {
			c=0;
			r++;
		}
		if(r==check.length) {//-ve BC
			return;
		}
        if(issafe(r,c,check)){
            check[r][c]=true;
		    place(r, c+1, toPlace-1, total_R, total_C,path+"q{"+r+","+c+"}",check);// Inc
            check[r][c]=false;
        }

		place(r, c+1, toPlace, total_R, total_C, path,check);// Ex
	}
    public static boolean issafe(int r,int c,boolean[][] check){

        for(int i=0;i<c;i++){
            if(check[r][i]){
                return false;
            }
        }

        for(int j=0;j<r;j++){
            if(check[j][c]){
                return false;
            }
        }

		int i=r;
		int j=c;
        while(i>=0&&j>=0){
			if(check[i][j]){
				return false;
			}
			i--;
			j--;
		}

		i=r;
		j=c;
	    while(i>=0&&j<check[0].length){
				if(check[i][j]){
					return false;
			}
			i--;
			j++;;
		}
        return true;
    }
}