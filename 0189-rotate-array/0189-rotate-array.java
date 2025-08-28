class Solution {

    private void reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // first k elements
        reverse(nums, 0, n-k-1);
        // last n-k elements
        reverse(nums, n-k, n-1);
        // whole array
        reverse(nums, 0, n-1);
    }
}