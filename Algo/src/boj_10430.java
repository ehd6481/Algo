import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://www.acmicpc.net/problem/10430
 * (A+B)%C�� ((A%C) + (B%C))%C �� ������?
 * (A��B)%C�� ((A%C) �� (B%C))%C �� ������?
 * �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class boj_10430 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bf.readLine().split(" ");
		int d1 = Integer.parseInt(s[0]);
		int d2 = Integer.parseInt(s[1]);
		int d3 = Integer.parseInt(s[2]);
		System.out.println((d1+d2)%d3);
		System.out.println(((d1+d3)+(d2+d3))%d3);
		System.out.println((d1*d2)%d3);
		System.out.println(((d1%d3)*(d2%d3))%d3);
	}

}
