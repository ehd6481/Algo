/*
 * https://www.acmicpc.net/problem/15552
 * ���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.

	C++�� ����ϰ� �ְ� cin/cout�� ����ϰ��� �Ѵٸ�, cin.tie(NULL)�� sync_with_stdio(false)�� �� �� ������ �ְ�, endl ��� ���๮��(\n)�� ����. ��, �̷��� �ϸ� �� �̻� scanf/printf/puts/getchar/putchar �� C�� ����� ����� ����ϸ� �� �ȴ�.

	Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.

	Python�� ����ϰ� �ִٸ�, input ��� sys.stdin.readline�� ����� �� �ִ�. ��, �̶��� �� ���� ���๮�ڱ��� ���� �Է¹ޱ� ������ ���ڿ��� �����ϰ� ���� ��� .rstrip()�� �߰��� �� �ִ� ���� ����.

	���� �Է°� ��� ��Ʈ���� �����̹Ƿ�, �׽�Ʈ���̽��� ���� �Է¹޾Ƽ� ������ �� ���� ����� �ʿ�� ����. �׽�Ʈ���̽��� �ϳ� ���� �� �ϳ� ����ص� �ȴ�.

	�ڼ��� ���� �� �ٸ� ����� ���� �� �ۿ� ����Ǿ� �ִ�.

	�� ��α� �ۿ��� BOJ�� ��Ÿ ���� ���� ���� �� �� �ִ�.
 */
package for��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_15552 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(bf.readLine());
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			bw.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
			
		}
		bw.flush();
		
	}

}
