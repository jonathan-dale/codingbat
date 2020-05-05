/**
 *Given an array of ints, return true if one of the first 4 elements
 * in the array is a 9. The array length may be less than 4.
 */
public class arrayFront9 {
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 4) break;
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    /**
     * A different version...
     * we do not check if i == 4 each
     * time iteration the loop, instead use a
     * variable to set parameters first thing.
     *
     *   int count = 4;
     *   if (nums.length < count) {
     *     count = nums.length;
     *   }
     *   for (int i = 0; i < count; i++) {
     *     if (nums[i] == 9) return true;
     *   }
     *   return false;
     */
}
