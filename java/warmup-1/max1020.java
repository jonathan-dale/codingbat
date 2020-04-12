/**
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 * or return 0 if neither is in that range.
 */
public class max1020 {
    public int max1020(int a, int b) {

        if (b > a) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        // now check a first, its larger so if in range it wins
        if (a <= 20 && a >= 10) {
            return a;
        }

        if (b <= 20 && b >= 10) {
            return b;
        }
        // if niether are in range
        return 0;
    }
}
