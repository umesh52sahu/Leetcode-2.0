class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        printvalidparentheses(n*2,"",0,ans);
        return ans;
    }
    
    public static void printvalidparentheses(int n,String str,int r,List<String> ans){
        if(n==0){
            if(r==0){
                ans.add(str);
            }
            return;
        }
        if(r<0){
            return;
        }
        printvalidparentheses(n-1, str+"(",r+1,ans);
        printvalidparentheses(n-1, str+")",r-1,ans);
    }
}