package stage15;

import java.io.*;

public class Step_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] primeCount = new int[246913];
		boolean[] prime = new boolean[246913];
		
		prime[0]=true;
		prime[1]=true;
		for(int i=2; i<Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				continue;
			}
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j]=true;
			}
		}
		int count =0;
		for(int i=0; i<prime.length; i++) {
			if(!prime[i]) {
				count++;
			}
			primeCount[i]=count;
		}
		
		while(true) {
			int temp = Integer.parseInt(br.readLine());
			if(temp==0) {
				break;
			}
			bw.write(primeCount[2*temp]-primeCount[temp]+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
