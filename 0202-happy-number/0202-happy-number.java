class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
            
               slow= num(slow);
               fast= num(num(fast));
           while(slow!=fast){
               slow= num(slow);
               fast= num(num(fast));
           }
        
            if(slow == 1 ){
                return true; 
            }
        return false;
    }
    public static int num(int n){
        int number = 0;
        int r = 0;
        while(n > 0){
            r = n % 10 ;
            number = number + r * r;
            n = n / 10;
        }
        return number;
    }
}
