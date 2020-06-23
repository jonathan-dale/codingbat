/**
 * Given an array of ints length 3, return the sum of all the elements.
 */



public class sum3 {
    public int sum3(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }
}
