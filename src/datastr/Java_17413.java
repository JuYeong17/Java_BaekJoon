package datastr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        Stack<Character> st=new Stack<>();
        String N=br.readLine();
        boolean flag=false;
        for(int i=0;i<N.length();i++){
            if(N.charAt(i)=='<'){
                flag=true;
                while(!st.empty()){
                    sb.append(st.pop());
                }
                sb.append(N.charAt(i));
            }
            else if(N.charAt(i)=='>'){
                flag=false;
                sb.append(N.charAt(i));
            }
            else if(flag){
                sb.append(N.charAt(i));
            }
            else if(!flag) {
                if (N.charAt(i) == ' '){
                    while(!st.empty())  {
                        sb.append(st.pop());
                    }
                    sb.append(N.charAt(i));
                }
                else {
                    st.push(N.charAt(i));
                }
            }
        }
        while(!st.empty()){
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
}
