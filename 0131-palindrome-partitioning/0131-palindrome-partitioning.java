class Solution {
    public List<List<String>> partition(String s) {
    List<List<String>> ans=new ArrayList<>();
        List<String> substr=new ArrayList<>();
        allsubstring(s,ans,substr);
        return ans;
    }
// Recursive call for all the substring exist
    public static void allsubstring(String str,List<List<String>> ans,List<String> substr){
        if(str.isEmpty()){
            if(!substr.isEmpty()){
                List<String> AL = new ArrayList<>(substr);
                ans.add(AL);
            }
            return;
        }
    
        for(int i=1;i<=str.length();i++){
            String check=str.substring(0, i);
            String remain=str.substring(i);
            
            if(ispalindrome(check)){
                substr.add(check); 
                allsubstring(remain,ans,substr);
                substr.remove(substr.size()-1);
                
             }
        }
    }
     
// check palindrome or not
    public static boolean ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}