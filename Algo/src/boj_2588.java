import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://www.acmicpc.net/problem/2588
 * 
 */
public class boj_2588 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		System.out.println(num*(s.charAt(2)-'0'));
		System.out.println(num*(s.charAt(1)-'0'));
		System.out.println(num*(s.charAt(0)-'0'));
		System.out.println(num*Integer.parseInt(s));
	}

}
