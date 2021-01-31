/*
 * https://www.acmicpc.net/problem/10950
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
package for문;

import java.util.Scanner;

public class boj_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x + y);
		}
	}

}
