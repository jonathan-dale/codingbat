public class diff21 {
    public int diff21(int n) {
        if (n >= 21) {
            return Math.abs(21-n)*2;
        }
        return Math.abs(21-n);
    }
}
