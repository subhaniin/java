public class java_math {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("a="+a+" b="+b);
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b)); // integer division
        System.out.println("Modulus: " + (a % b));

        System.out.println("Power: " + Math.pow(a, b));
        System.out.println("Square Root of a: " + Math.sqrt(a));
        System.out.println("Maximum: " + Math.max(a, b));
        System.out.println("Minimum: " + Math.min(a, b));
        System.out.println("Absolute value of -a: " + Math.abs(-a));
        System.out.println("Random number between 0 and 1: " + Math.random());
        System.out.println("Ceiling of 4.3: " + Math.ceil(4.3));
        System.out.println("Floor of 4.7: " + Math.floor(4.7));
        System.out.println("Round of 4.5: " + Math.round(4.5));
        System.out.println("Logarithm of a: " + Math.log(a));
        System.out.println("Exponential of a: " + Math.exp(a));

        System.out.println("Sine of 45 degrees: " + Math.sin(Math.toRadians(45)));
        System.out.println("Cosine of 45 degrees: " + Math.cos(Math.toRadians(45)));
        System.out.println("Tangent of 45 degrees: " + Math.tan(Math.toRadians(45)));

        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("GCD of 54 and 24: " + gcd(54, 24));
        System.out.println("LCM of 54 and 24: " + lcm(54, 24));
        System.out.println("Prime check for 29: " + isPrime(29));

        System.out.println("Fibonacci series up to 10 terms:");
        fibonacci(10);

        System.out.println("--------------------------------------------------");
        System.out.println("Java Math Operations Completed 🚀");
        System.out.println("--------------------------------------------------");
    }

    // Factorial
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // GCD (Euclidean algorithm)
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Prime check
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Fibonacci series
    static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}