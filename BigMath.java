public class BigMath {
    public static String add(String a, String b) {
        return new java.math.BigInteger(a).add(new java.math.BigInteger(b)).toString();
    }

    public static String subtract(String a, String b) {
        return new java.math.BigInteger(a).subtract(new java.math.BigInteger(b)).toString();
    }

    public static String multiply(String a, String b) {
        return new java.math.BigInteger(a).multiply(new java.math.BigInteger(b)).toString();
    }

    public static String divide(String a, String b) {
        return new java.math.BigInteger(a).divide(new java.math.BigInteger(b)).toString();
    }

    public static String negate(String a) {
        return new java.math.BigInteger(a).negate().toString();
    }
}
