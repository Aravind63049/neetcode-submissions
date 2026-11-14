class Solution {
    public boolean hasDuplicate(int[] arr) {
       boolean d = false;
        Arrays.sort(arr);
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                d = true;
            }
        }
        if(d){
            return true;
        }
        return false;
       
 
    }
}
