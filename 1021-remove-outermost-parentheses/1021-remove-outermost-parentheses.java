class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int open=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' && open++>0){
                str.append(ch);
            }
            if(ch==')' && open-->1){
                str.append(ch);
            }
        }
        return str.toString();
    }
}