
class gcd {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 20, num2 = 40;
        int res = gcd(num1, num2);
        System.out.println(res);

    }
}
