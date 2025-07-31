class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i : gifts){
            pq.offer(i);
        }

        for(int i = 0; i < k; i++){
            int max = pq.poll();
            int sq = (int)Math.floor(Math.sqrt(max));
            pq.offer(sq);
        }

        long sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}