package for¹®;

import java.util.Scanner;

public class boj_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for(int i=0;i<n;i++) {
			int t = sc.nextInt();
			if(x>t) System.out.print(t+" ");
		}
	}

}
