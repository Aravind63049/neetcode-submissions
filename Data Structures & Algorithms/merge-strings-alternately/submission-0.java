class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int l = 0;
        int r = 0;
        while(l< word1.length() && r < word2.length()){
            ans += word1.charAt(l);
            l++;
            ans += word2.charAt(r);
            r++;
        }
        if(l < word1.length()){
            while(l<word1.length()){
            ans += word1.charAt(l);
            l++;
        }

        }else{
             while(r<word2.length()){
            ans += word2.charAt(r);
            r++;
        }
        }

        return ans;

    }
}