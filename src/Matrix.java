public class Matrix {

    public static void XorAverages(){
        byte[][] m1 = {{3,2,6}, {9,5,4}, {1,8,3}};
        byte[][] m2 = {{12,1,7}, {3,4,78}, {123,98,1}};

        System.out.println("Matrix1:");
        show(m1);
        System.out.println("Matrix2:");
        show(m2);

        byte[][] res = xor(m1,m2);

        System.out.println("XOR result matrix:");
        show(res);
        System.out.println("XOR result matrix averages by rows:");
        show(getRowsAverages(res));
    }

    public static byte[][] xor(byte[][] m1, byte[][] m2){
        try{
        byte[][] res = new byte[m1.length][m1[0].length];

            for (int i = 0; i < m1.length; i++)
                for (int j = 0; j < m1[0].length; j++)
                    res[i][j] = (byte) (m1[i][j] ^ m2[i][j]);
            return res;
        } catch(NullPointerException e){
            e.printStackTrace();
        }   catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return null;
    }

    public static double[] getRowsAverages(byte[][] m){
        double avgs[] = new double[m.length];
        double avg;


        try{
        for (int i = 0; i < m.length; i++) {
            avg = 0;
            for (int j = 0; j < m[0].length; j++)
                avg += m[i][j];
            avg = avg/m.length;
            avgs[i] = avg;
        }

        } catch(NullPointerException e){
            e.printStackTrace();
        }
        return avgs;
    }

    public static void show(double[] arr){
        try{
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        } catch(NullPointerException e){
            e.printStackTrace();
        }
    }

    public static void show(byte[][] m){
        try{
            for (int i = 0; i < m.length; i++)
                show(m[i]);
            System.out.println();
        } catch(NullPointerException e){
            e.printStackTrace();
        }
    }

    public static void show(byte[] arr){
        try{
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        } catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
