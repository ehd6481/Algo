package if¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_9498 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		
		if(x>=90)bw.append("A");
		else if(x>=80)bw.append("B");
		else if(x>=70)bw.append("C");
		else if(x>=60)bw.append("D");
		else bw.append("F");
		bw.flush();
	}

}
