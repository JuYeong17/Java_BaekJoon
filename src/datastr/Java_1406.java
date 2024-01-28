package datastr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String N=br.readLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        int M=Integer.parseInt(br.readLine());
        for(int i=0;i<N.length();i++){
            left.push(N.charAt(i));
        }
        for(int j=0;j<M;j++) {
            String com = br.readLine();
            switch (com.charAt(0)) {
                case 'L':
                    if (!left.empty()) right.push(left.pop());
                    break;
                case 'D':
                    if (!right.empty()) left.push(right.pop());
                    break;
                case 'B':
                    if (!left.empty()) left.pop();
                    break;
                case 'P':
                    left.push(com.charAt(2));
                    break;
            }
        }
        while(!left.empty()){
            right.push(left.pop());
        }
        StringBuilder sb = new StringBuilder();
        while(!right.empty()){
            sb.append(right.pop());
        }
        System.out.println(sb.toString());
    }
}
