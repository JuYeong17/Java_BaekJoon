package datastr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++) {
            Stack<Character> st=new Stack<>();
            String s=br.readLine();
            StringBuilder stb=new StringBuilder();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    while(!st.empty()){
                        stb.append(st.pop());
                    }
                    stb.append(" ");
                } else{
                    st.push(s.charAt(j));
                }
            }
            while(!st.empty()){
                stb.append(st.pop());
            }
            System.out.println(stb);
        }

    }
    /* 스택을 쓰지 않고
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            String[] st=br.readLine().split(" ");

            for(String word:st){
                StringBuilder sb= new StringBuilder(word);
                System.out.print(sb.reverse().toString()+" ");
            }
            System.out.println();
        }
    }

     */
}
