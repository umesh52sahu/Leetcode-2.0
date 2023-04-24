class Solution {
    public int romanToInt(String s) {
        int max=0;
        int temp=0;
        char[] ch={'I','V','X','L','C','D','M'};
        int[] num={1,5,10,50,100,500,1000};
        for(int i=s.length()-1;i>=0;i--){
            char ch1=s.charAt(i);
            for(int j=0;j<num.length;j++){
                if(ch1==ch[j]){
                    if(num[j]>=temp){
                        max+=num[j];
                    } else{
                        max-=num[j];
                    }
                    temp=num[j];
                }
            }
        }
        return max;
    }
}