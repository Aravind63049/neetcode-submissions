class Solution {
    public int lastStoneWeight(int[] stones) {
     PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<stones.length;i++){
            q.add(stones[i]);
        }
        while(q.size()>1){
            int x = q.poll();
            int y = q.poll();
            if(x!=y){
                q.add(x-y);
            }

        }
        if(q.size()==0){
            return 0;
        }
        return q.peek();
        
        
    }
}
