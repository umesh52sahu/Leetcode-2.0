class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
      return check(a,b)||check(b,a);
    }
    public static boolean check(String a,String b){
        
        int i=0;
        int j=a.length()-1;
        while(i<j&&a.charAt(i)==b.charAt(j)){
                i++; j--;
        }
        
        if(i>=j) return true;
        else{
            
        }
        
        return palin(a,i,j)||palin(b,i,j);
    }
   
    public static boolean palin(String str,int i,int j){
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
                i++; j--;
            
        }
        return true;
    }
}
