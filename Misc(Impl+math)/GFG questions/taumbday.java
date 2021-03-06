import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class taumbday {

    // Complete the taumBday function below.
    static int taumBday(int b, int w, int bc, int wc, int z) {
    
            
        if (bc + z < wc)
            return (b+w)*bc + z*w;
        if (wc + z <bc)
            return (b+w)*wc + z*b;
        return (b*bc)+(w*wc);




    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println ();
        for (int tItr = 0; tItr < t; tItr++) {
            String[] bw = scanner.nextLine().split(" ");

            int b = Integer.parseInt(bw[0]);

            int w = Integer.parseInt(bw[1]);

            String[] bcWcz = scanner.nextLine().split(" ");

            int bc = Integer.parseInt(bcWcz[0]);

            int wc = Integer.parseInt(bcWcz[1]);

            int z = Integer.parseInt(bcWcz[2]);

            int result = taumBday(b, w, bc, wc, z);
            System.out.println (result);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
