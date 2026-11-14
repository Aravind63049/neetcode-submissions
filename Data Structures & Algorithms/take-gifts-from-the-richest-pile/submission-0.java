class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<gifts.length;i++){
            q.add(gifts[i]);
        }
        for(int i = 0;i<k;i++){
            int a = q.poll();
            int val = (int) Math.floor(Math.sqrt(a));
            q.add(val);
        }
        long sum = 0;
       while(q.size()!=0){
        sum+=q.poll();
       }
        return sum;
        
    }
}