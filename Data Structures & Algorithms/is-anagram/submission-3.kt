class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length){
            return false;
        }
        val arr = IntArray(s.length)
        val arr1 = IntArray(t.length)
        for(i in 0 until s.length){
            arr[i] = s[i].code;
            arr1[i] = t[i].code;
        }
        arr.sort();
        arr1.sort();
        for(i in 0 until s.length){
            if(arr[i] != arr1[i]){
                return false;
            }
        }
        return true;
    }
}
