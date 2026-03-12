import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Edge case check
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }

        int n = nums.length;
        Deque<Integer> d = new ArrayDeque<>();
        int[] arr = new int[n - k + 1];  // Result array to store the max of each window
        int index = 0;

        for (int i = 0; i < n; i++) {
            // Remove elements from the deque which are out of the window
            if (!d.isEmpty() && d.peekFirst() <= i - k) {
                d.pollFirst();
            }

            // Remove elements from the back of the deque if they are smaller than the current element
            while (!d.isEmpty() && nums[d.peekLast()] < nums[i]) {
                d.pollLast();
            }

            // Add the current element index to the deque
            d.offerLast(i);

            // Once we've processed at least k elements, record the maximum
            if (i >= k - 1) {
                arr[index] = nums[d.peekFirst()];  // The maximum is at the front of the deque
                index++;
            }
        }

        return arr;
    }
}
