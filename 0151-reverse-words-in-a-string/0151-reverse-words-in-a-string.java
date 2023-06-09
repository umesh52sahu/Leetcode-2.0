class Solution {
    public String reverseWords(String s) {
        String str="";
        s=s+" ";
        int si=0;
        int ei=0;
        int i=0;
        while(i<s.length()){
            // System.out.println(i+" "+si+" "+ei);
            if(s.charAt(i)==' '){
                if(s.charAt(si)!=' '&&s.charAt(ei)!=' ')
                str=" "+s.substring(si,ei+1)+str;
                si=i+1;
                ei=i;
            } else{
                ei=i;
            }
            i++;
        }
        return str.substring(1);
    }
}