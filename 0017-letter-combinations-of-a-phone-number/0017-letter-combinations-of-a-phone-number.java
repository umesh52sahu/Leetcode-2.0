class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> fList=new ArrayList<>();    
        printLetterComboPhoneNo(digits,"",fList); 
        
        return fList;
    }
    public static void printLetterComboPhoneNo(String digits,String ans,List<String> fList){
        if(digits.isEmpty()){
                if(!ans.isEmpty()){
                    fList.add(ans);
                }
            return;
        }
        
        char ch=digits.charAt(0);
        String check=digits.substring(1);
        String letters=digits(ch);
        
        for(int i=0;i<letters.length();i++){
                printLetterComboPhoneNo(check, ans+letters.charAt(i),fList);
            }
        }
    public static String digits(char ch){
        String[] arr={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return arr[ch-'2'];
    }
}