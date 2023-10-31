package stage24;

import java.util.*;
import java.io.*;

public class Step_4 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
        long result = 0;           
        long[] S = new long[N + 1];      
        long[] count = new long[M];     
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            S[i] = (S[i - 1] + Integer.parseInt(st.nextToken())) % M;
            if(S[i] == 0) {
                result++;
            }
            count[(int) S[i]]++;
        }
        for(int i=0; i<M; i++) {
            if(count[i] > 1) {
                result += (count[i]* (count[i]-1) / 2);
            }
        }
        System.out.println(result);
    }
}