package datastr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int si=1;
        int ei=1;
        int sum=1;
        int count=1;
        while(ei != N){
            if(sum==N){
                ei++;
                count++;
                sum+=ei;
            }
            else if(sum > N){
                sum=sum-si;
                si++;
            }
            else{
                ei++;
                sum=sum+ei;
            }
        }
        System.out.println(count);
    }

}
