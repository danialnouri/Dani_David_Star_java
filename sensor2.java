
import java.util.Scanner;

public class sensor2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float n, latestinp;
        latestinp = 0;
        int latestIncrementalLength, latestDecrementalLength, latestStabilityLength;
        int inclength, declength, stablelength;
        float candidincmin, candiddecmin, candidincmax, candiddecmax, incmin, decmin;
        candiddecmax = 0;
        candiddecmin = 0;
        candidincmax = 0;
        candidincmin = 0;
        incmin = 0;
        decmin = 0;
        inclength = 0;
        declength = 0;
        stablelength = 0;
        latestStabilityLength = 0;
        latestDecrementalLength = 0;
        latestIncrementalLength = 0;
        int lastStableLength = 0;
        float sum;
        int count, miangin, max1, min1;
        float max, min;
        int a1, a2;
        a1 = 0;
        a2 = 0;
        max = -Float.MAX_VALUE;
        min = Float.MAX_VALUE;
        sum = 0;
        count = 0;
        boolean cal = false;
        while (true) {
            String str = inp.next();
            if (str.equals("e")) {
                break;
            }
            n = Float.parseFloat(str);
            sum += n;
            count += 1;
            max = n > max ? n : max;
            min = n < min ? n : min;
            if (cal) {
                if (n > latestinp) {
                    if (latestIncrementalLength == 0) {
                        candidincmin = latestinp;
                    }
                    latestIncrementalLength++;
                    if (latestIncrementalLength >= inclength) {
                        incmin = candidincmin;
                        candidincmax = n;
                        inclength = latestIncrementalLength;
                    }
                    latestDecrementalLength = 0;
                    latestStabilityLength = 0;
                } else if (n == latestinp) {
                    latestStabilityLength++;
                    if (latestStabilityLength >= stablelength) {
                        stablelength = latestStabilityLength;
                    }
                    latestDecrementalLength = 0;
                    latestIncrementalLength = 0;
                } else if (n < latestinp) {
                    if (latestDecrementalLength == 0) {
                        candiddecmin = latestinp;
                    }
                    latestDecrementalLength++;
                    if (latestDecrementalLength >= declength) {
                        decmin = candiddecmin;
                        candiddecmax = n;
                        declength = latestDecrementalLength;
                    }
                    latestIncrementalLength = 0;
                    latestStabilityLength = 0;
                }
            }
            latestinp = n;
            cal = true;
        }
        miangin = (int) Math.round(sum / count);
        max1 = (int) Math.round(max);
        min1 = (int) Math.round(min);
        a1 = (int) Math.floor(candidincmax - incmin);
        a2 = Math.round(decmin - candiddecmax);
        if (stablelength != 0) {
            lastStableLength = stablelength + 1;
        }
        System.out.println(a1 + "," + a2 + "," + lastStableLength + "," + max1 + "," +
                min1 + "," + miangin);
    }
}
