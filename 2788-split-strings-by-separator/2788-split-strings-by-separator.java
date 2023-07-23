class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans =  new ArrayList<String>();
        for(int i=0;i<words.size();i++){
            String str = words.get(i);
            String[] arr=str.split("["+separator+"]");
            for(int j=0;j<arr.length;j++){
                if(arr[j].length()>0){
                    ans.add(arr[j]);
                }
            }
            
                      
        }
        return ans;
    }
}