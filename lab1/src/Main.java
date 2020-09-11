import java.lang.Math;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        int[] g = new int[14];
        int m = 16;
        for (int i = 0; i < g.length; i++) {
            g[i] = m;
            m--;
        }

        double[] x = new double[20];
        float min = -7.0f;
        float max = 11.0f;

        for (int i = 0; i < x.length; i++) {
            x[i] = (double)(Math.random() * (max - min)) + min;
        }

        double[][] d = new double[14][20];

        for (int i = 0; i < g.length; i ++) {
            switch (g[i]) {

                case 3:
                    for (int j = 0; j < x.length; j++) {
                        d[i][j] = Math.pow(Math.pow(4 * (0.75 - Math.log(Math.abs(x[j]))), Math.tan(x[j])), 
                        Math.log(3 / (4 + Math.abs(x[j]))));
                    } 
                    break;
                
                case 4:
                case 5:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                    for (int j = 0; j < x.length; j++)
                        d[i][j] = Math.tan(Math.cos(Math.pow(x[j], 1 / 3)));
                
                default:
                    for (int j = 0; j < x.length; j++)
                        d[i][j] = (Math.cos(Math.pow(2 * Math.asin((x[j] + 2) / 18), 3)) - 0.75) / 2;
            }
        }
        double k;
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 20; j++){
                k = d[i][j];
                String formattedDouble = new DecimalFormat("#0.000").format(k);
                System.out.println(formattedDouble);
            }
        }

    }
}
