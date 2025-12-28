
class ArmStrong {

    public static void main(String args[]) {
        int n = 153;
        int num = n;
        double sum = 0;
        int len = String.valueOf(n).length();
        while (n != 0) {
            int rem = n % 10;
            sum = sum + Math.pow(rem, len);
            n /= 10;
        }
        boolean isArmStrong = sum == num;
        System.out.println(isArmStrong);
    }
}
