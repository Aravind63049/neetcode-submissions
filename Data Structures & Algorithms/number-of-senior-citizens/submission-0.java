class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0;i<details.length;i++){
            String  s= details[i];
            int age = Integer.parseInt(s.substring(s.length() - 4, s.length() - 2));
            if(age>60){
                count++;
            }
            }

        return count;
        
    }
}