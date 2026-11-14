class Solution {
    public String isSorted(String s){
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (int i = 0; i < s.length; i++){
            List<String> temp;
            if (hm.containsKey(isSorted(s[i]))){
                temp = hm.get(isSorted(s[i]));
            } else {
                temp = new ArrayList<>();
                hm.put(isSorted(s[i]),temp);
            }
            temp.add(s[i]);
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> list : hm.values()){
            result.add(list);
        }
        return result;
    }
}