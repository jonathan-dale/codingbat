/**
 * Given an array of ints, return the number of times that two 6's are next to each other
 * in the array. Also count instances where the second "6" is actually a 7.
 *
 */

public class array667 {
    public int array667(int[] nums) {

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] == 7 || nums[i] == 6) && (nums[i-1] == 6)) {
                count++;
            }
        }
        return count;
    }
}
