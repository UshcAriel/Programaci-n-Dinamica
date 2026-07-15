public class App {
    public static void main(String[] args) throws Exception {
        runFibonaci();
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

}
