package stage05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_11_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            String str = br.readLine();
            if (str == null || str.isEmpty())
                break;
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
