public class App {
    public static void main(String[] args) throws Exception {
        FibonacciT(48);
    }

    private static void runFibonaci() {
        long startTime = System.nanoTime();
        int num = 48;
        long i = getFibonacci(num);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        double milliseconds = (executionTime / 1_000_000.0);

        System.out.println("Finbonaci de " + num + " es " + i + "  en: " + milliseconds + " milliseconds");

    }

    private static long getFibonacci(int i) {
        if (i <= 1) {
            return i;
        }
        return getFibonacci(i - 1) + getFibonacci(i - 2);
    }
    
    private static long FibonacciT(int n) {
        
        if (n <= 1) return n;
        long[] dp = new long[n+1];
        dp[0] = 0; dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i -1] + dp[i -2];
        }
        
        System.err.println(dp[n]);
        return dp[n];
    }
}
