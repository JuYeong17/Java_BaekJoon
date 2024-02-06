package datastr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Java_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        Deque<Integer> deq=new LinkedList<>();
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            switch(str) {
                case "push_front":
                    deq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(deq.isEmpty()){ sb.append(-1).append("\n"); }
                    else{ sb.append(deq.pollFirst()).append("\n"); }
                    break;
                case "pop_back":
                    if(deq.isEmpty()){ sb.append(-1).append("\n");}
                    else{ sb.append(deq.pollLast()).append("\n"); }
                    break;
                case "size":
                    sb.append(deq.size()).append("\n");
                    break;
                case "empty":
                    if(deq.isEmpty()) { sb.append(1).append("\n");}
                    else { sb.append(0).append("\n");}
                    break;
                case "front":
                    if(deq.isEmpty()) { sb.append(-1).append("\n");}
                    else {sb.append(deq.getFirst()).append("\n");}
                    break;
                case "back":
                    if(deq.isEmpty()) { sb.append(-1).append("\n");}
                    else {sb.append(deq.getLast()).append("\n");}
                    break;
            }
        }
        System.out.println(sb);
    }
}
