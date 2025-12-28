
class PrimeNumber {
    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 10;
        boolean isPrime = isPrime(num);
        System.out.println(isPrime);
    }
}
///     Other method 
class PrimeNumber {

    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;

    }

    public static void main(String[] args) {
        int num = 20;
        boolean res = isPrime(num);
        System.out.println(res);
    }
}
