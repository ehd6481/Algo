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
//		값 넣기
		for(int i=0;i<n*2;i++) {
			con.add(Integer.parseInt(st.nextToken()));
		}
		
		int result=1;
		int flag=0;
		while(true) {
//			1. 컨베이어 회전
			con.addFirst(con.pollLast());
			for(int i=n-1;i>0;i--) {
				robot[i] = robot[i-1];
				robot[i-1]=false;
			}
			if(robot[n-1]==true) {
				robot[n-1]=false;
			}
//			2. 먼저 벨트에 올라간 로봇부터 회전방향으로 한칸 이동, 이동 x => 가만히
			if(con.get(n-1)>0&&robot[n-1]==false) {//내구도 0이상이면서 로봇이 없다
				if(robot[n-2]==true) { //그전칸에 로봇이 있다
					robot[n-2]=false;
//					con.get(n-1)-=1;
					con.set(n-1, con.get(n-1)-1);
					if(con.get(n-1)==0) {
						flag++;
					}
				}
			}
			
//			맨마지막
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
//			3. 올라가는 위치에 로봇이 없다면 올림
			if(robot[0]==false&&con.get(0)>0) {
				robot[0]=true;
//				con.get(0)-=1;
				con.set(0, con.get(0)-1);
				if(con.get(0)==0) {
					flag++;
				}
			}
			
//			4. 내구도 0인 칸의 갯수가 k개 이상이라면 종료
			if(flag>=k) {
				break;
			}
			result++;
			
		}
		
		System.out.println(result);
		
		
		
	}

}
