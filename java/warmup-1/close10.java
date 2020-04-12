/**
 * Given 2 int values, return whichever value is nearest to the value 10,
 * or return 0 in the event of a tie. Note that Math.abs(n) returns the
 * absolute value of a number.
 */
public class close10 {
    public int close10(int a, int b) {
        int distA = Math.abs(10 - a);
        int distB = Math.abs(10 - b);

        if (distA == distB) {
            return 0;
        }
        return distA < distB ? a:b;
    }
}
