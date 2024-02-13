package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] N=new int[n];
        for(int i=0;i<n;i++){
            N[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(N);
        int result=N[0]*N[n-1];
        System.out.println(result);
    }
}
