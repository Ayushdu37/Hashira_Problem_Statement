import java.util.List;

public class Lagrange {
    public static String solveAtZero(List<String> x, List<String> y) {
        int k = x.size();
        String result = "0";

        try {
            for (int i = 0; i < k; i++) {
                String numerator = "1";
                String denominator = "1";

                for (int j = 0; j < k; j++) {
                    if (i == j) continue;
                    numerator = BigMath.multiply(numerator, BigMath.negate(x.get(j)));
                    denominator = BigMath.multiply(denominator, BigMath.subtract(x.get(i), x.get(j)));
                }

                String fraction = BigMath.divide(numerator, denominator);
                String term = BigMath.multiply(y.get(i), fraction);
                result = BigMath.add(result, term);
            }
            return result;
        } catch (Exception e) {
            return null;
        }
    }
}
