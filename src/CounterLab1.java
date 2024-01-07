public class CounterLab1 {
    public static void count(){
        short a = 0;
        short b = -5;
        short n = 5;
        short m = -2;
        int c = 2;
        double res = 0;
        try{
            if(a <= -c && n >= -c)
                throw new RuntimeException("Devision by zero");
            if(b <= 0 && m >= 0)
                throw new RuntimeException("Devision by zero");
            for (short i = a; i <= n; i++)
                for (short j = b; j <= m; j++) {
                    res += (double) (i % j) / (i + c);
                }

        } catch(ArithmeticException ae){
            System.err.print("Division by zero. Make sure 'j != 0' and 'i + c != 0' on the whole sum range.");
        }
        System.out.println("Result = " + res);
    }
}
