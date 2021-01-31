import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj_20055 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine()," ");
		LinkedList<Integer> con =new LinkedList<Integer>();
		boolean robot[] = new boolean[n];
//		�� �ֱ�
		for(int i=0;i<n*2;i++) {
			con.add(Integer.parseInt(st.nextToken()));
		}
		
		int result=1;
		int flag=0;
		while(true) {
//			1. �����̾� ȸ��
			con.addFirst(con.pollLast());
			for(int i=n-1;i>0;i--) {
				robot[i] = robot[i-1];
				robot[i-1]=false;
			}
			if(robot[n-1]==true) {
				robot[n-1]=false;
			}
//			2. ���� ��Ʈ�� �ö� �κ����� ȸ���������� ��ĭ �̵�, �̵� x => ������
			if(con.get(n-1)>0&&robot[n-1]==false) {//������ 0�̻��̸鼭 �κ��� ����
				if(robot[n-2]==true) { //����ĭ�� �κ��� �ִ�
					robot[n-2]=false;
//					con.get(n-1)-=1;
					con.set(n-1, con.get(n-1)-1);
					if(con.get(n-1)==0) {
						flag++;
					}
				}
			}
			
//			�Ǹ�����
			for(int i=n-2;i>0;i--) {
				if(con.get(i)>0&&robot[i]==false) {
					if(robot[i-1]==true) {
						robot[i-1]=false;
//						con.get(i)-=1;
						con.set(i, con.get(i)-1);
						robot[i]=true;
						if(con.get(i)==0) {
							flag++;
						}
					}
				}
			}
//			3. �ö󰡴� ��ġ�� �κ��� ���ٸ� �ø�
			if(robot[0]==false&&con.get(0)>0) {
				robot[0]=true;
//				con.get(0)-=1;
				con.set(0, con.get(0)-1);
				if(con.get(0)==0) {
					flag++;
				}
			}
			
//			4. ������ 0�� ĭ�� ������ k�� �̻��̶�� ����
			if(flag>=k) {
				break;
			}
			result++;
			
		}
		
		System.out.println(result);
		
		
		
	}

}
