public class StaticMathOperations {

    public static int divideWithIntResult(int dividend, int divider) {
        return (int) divideWithDoubleResult(dividend, divider);
    }

    public static double divideWithDoubleResult(int dividend, double divider) {
        if(divider == 0) throw new IllegalArgumentException("Incorrect divider");
        if(dividend == 0) return 0;

        int absDividend = dividend > 0 ? dividend : (-1) * dividend;
        double absDivider = divider > 0 ? divider : (-1) * divider;

        int multiplier = 0;
        while((multiplier + 1) * absDivider  <= absDividend) {
            multiplier++;
        }

        int reminder = (int)(absDividend - absDivider * multiplier);
        double result = multiplier + reminder / absDivider;

        if ((dividend < 0 && divider < 0) || (dividend > 0 && divider > 0)) {
            return result;
        } else {
            return (-1) * result;
        }
    }

    public static int getRemainderOfDivision(int dividend, int divider) {
        return dividend % divider;
    }
}

