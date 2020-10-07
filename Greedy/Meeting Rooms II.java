//https://leetcode.com/problems/meeting-rooms-ii/

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<intervals.length; i++)
        {
            if(!pq.isEmpty() && pq.peek() <= intervals[i][0]) pq.poll();
            
            pq.offer(intervals[i][1]);
        }
        
        return pq.size();
    }
}
