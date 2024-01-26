package datastr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());

        int[] num= new int[N+1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        int si=1;
        int ei=N;
        int count=0;
        while(si<ei){
            if(num[si]+num[ei]==M){
                count++;
                si++;
                ei--;
            }
            else if(num[si]+num[ei]<M){
                si++;
            }
            else{
                ei--;
            }
        }
        System.out.println(count);
    }
}
