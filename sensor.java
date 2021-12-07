
import java.util.Scanner;

public class sensor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float min, max;
        min = Float.MAX_VALUE;
        max = -Float.MAX_VALUE;
        float gabli;
        int bazeMax;
        int bazeMin;
        bazeMax = 0;
        bazeMin = 0;
        int bazeMax1;
        int bazeMin1;
        bazeMax1 = 0;
        bazeMin1 = 0;
        float sum;
        sum = 0;
        int tedad;
        tedad = 0;
        int miangin;
        int max1;
        int min1;

        while (true) {
            String n = input.nextLine();

            if (n.equals("e")) {
                break;
            } else {
                float a = Float.parseFloat(n);
                max = a > max ? a : max;
                min = a < min ? a : min;
                sum += a;
                tedad++;
            }

            float a = Float.parseFloat(n);
            gabli = a;

            if (a > gabli) {

                bazeMax++;

            } else if (a < gabli) {

                bazeMin++;

            }

            bazeMax1 = bazeMax;
            bazeMin1 = bazeMin;

        }

        miangin = (int) Math.round(sum / tedad);
        max1 = (int) Math.round(max);
        min1 = (int) Math.round(min);

        System.out.println(max1 + ", " + min1 + " , " + miangin + " ");

    }

}
