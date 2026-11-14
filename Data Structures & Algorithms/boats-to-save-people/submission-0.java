class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int start = 0;
        int end = people.length-1;
        while(start <= end){
            if(start==end){
                count++;
                break;
            }
            int sum = people[start] + people[end];
            if(sum<=limit){
                count++;
                start++;end--;
            }else{
                count++;
                end--;
            }
        }
        return count;


        
    }
}