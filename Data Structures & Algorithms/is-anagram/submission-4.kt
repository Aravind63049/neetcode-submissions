class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val arr = IntArray(26);
        val n = s.length
        if(n != t.length){
            return false;
        }
        for(i in 0 until n){
            arr[s[i] - 'a']++;
            arr[t[i] - 'a']--;
        }

        for(i in 0 until 26){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}