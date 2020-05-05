/**
 * Given an array of ints, return true if the sequence of numbers
 * 1, 2, 3 appears in the array somewhere.
 */
public class array123 {
    public boolean array123(int[] nums) {
        boolean result = false;
        if (nums.length < 3) return result;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2]==3) {
                result = true;
            }
        }
        return result;
    }
}
