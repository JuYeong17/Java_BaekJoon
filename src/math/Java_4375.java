package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n;
        while ((n = br.readLine()) != null) {
            int num = Integer.parseInt(n);
            int i = 1;
            int count = 1;

            if (num != 2 && num != 5) {
                while (i % num != 0) {
                    i = (i % num) * 10 + 1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
