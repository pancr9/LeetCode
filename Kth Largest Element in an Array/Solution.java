class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
        
        for(Integer i : nums){
        
        queue.offer(i);    
        while(queue.size() > k)
            queue.poll();  
        }    
        
        return queue.peek();
    }
}
