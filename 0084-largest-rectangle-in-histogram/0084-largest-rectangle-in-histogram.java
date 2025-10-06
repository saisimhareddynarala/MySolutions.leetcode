class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> st = new Stack();
        st.push(-1);
        for(int i=0 ; i<heights.length ; i++)
        {
            while(st.peek() != -1 && heights[i] <= heights[st.peek()])
            {
                int h = heights[st.pop()];
                int w = i - st.peek() - 1;
                maxArea = Math.max(maxArea, h * w);

            }
            st.push(i);
        }
        while(st.peek()!=-1)
        {
           int h = heights[st.pop()];
           int w = heights.length - st.peek() - 1;
            maxArea = Math.max(maxArea, h * w);
        }
        return maxArea;

    }
}