/*
 * https://www.acmicpc.net/problem/8393
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package for��;

import java.util.Scanner;

public class boj_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
