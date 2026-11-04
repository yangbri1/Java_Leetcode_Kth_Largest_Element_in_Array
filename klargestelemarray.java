class Solution {
    public int findKthLargest(int[] nums, int k) {

        /* brute force approach */
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int reversedKIndex = nums.length - k;

        return(nums[reversedKIndex]);

    //     // initialize an empty 'PriorityQueue' as it follows natural ordering by default
    //     PriorityQueue<Integer> numsNaturalOrdering = new PriorityQueue<>();

    //     for(int i = 0; i < nums.length; ++i){
    //         numsNaturalOrdering.add(nums[i]);
    //     }
    //     System.out.println(numsNaturalOrdering);

    //     // +1 shift accounts for index starting at 0 in Java containers
    //     // int kLargestIndexBackward = nums.length - k + 1;
    //     int kLargestIndexBackward = nums.length - k;

    //     for(int j = 0; j < numsNaturalOrdering.size(); ++j){
    //         numsNaturalOrdering.poll();
    //     }
    //     return(numsNaturalOrdering.peek());
    }
}