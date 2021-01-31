/*
 * https://www.acmicpc.net/problem/2739
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */
package for문;

import java.util.Scanner;

public class boj_2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(x +" * "+i+" = "+x*i);
		}
	}

}
