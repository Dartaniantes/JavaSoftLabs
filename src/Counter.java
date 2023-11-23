public class Counter {
    public static void count(){
        short a = 0;
        short b = 1;
        short n = 5;
        short m = 3;
        int c = 2;
        double res = 0;
        try{
            for (short i = a; i <= n; i++)
                for (short j = b; j <= m; j++) {
                    res += (double) (i % j) / (i + c);
                    System.out.println(res);
                }

        } catch(ArithmeticException ae){
            System.err.print("Division by zero. Make sure 'j != 0' and 'i + c != 0' on the whole sum range.");
        }
        System.out.println("Result = " + res);
    }
}
