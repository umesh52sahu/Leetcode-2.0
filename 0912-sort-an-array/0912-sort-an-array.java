class Solution {
    public int[] sortArray(int[] nums) {
        int[] ans=sort(nums,0,nums.length-1);
        return ans;
    }
    public static int[] sort(int[] arr,int si,int ei){
        if(si==ei){
            int[] a3=new int[1];
            a3[0]=arr[si];
            return a3;
        }
        int m=(si+ei)/2;
        int[] a1=sort(arr,si,m);
        int[] a2=sort(arr,m+1,ei);
        int[] ans=merge(a1,a2);
        return ans; 
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int[] arr3=new int[arr1.length+arr2.length];
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }else{
                arr3[k]=arr2[j];
                j++;
            } 
            k++; 
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            k++;
            j++;
        }
        return arr3;   
    }
}