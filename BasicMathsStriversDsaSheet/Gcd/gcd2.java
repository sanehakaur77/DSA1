
class gcd2 {

    public static int gcd(int a, int b) {
        int gcd = 1;
        int num = Math.min(a, b);
        for (int i = 1; i <= num; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = gcd * i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int num1 = 20, num2 = 40;
        int res = gcd(num1, num2);
        System.err.println(res);

    }
}
