package ch7;
			//����
class Point{int x; int y;}

class circle{
	Point c=new Point();//���������� �ʱ�ȭ
	int r;
}


public class c2 {
	public static void main(String[] args) {
		circle q=new circle(); //��ü����� ����Ұ� /nell�� �����ϸ� �ּҰ���� iv�� ����� ����
		q.c.y=2;
		q.r=3;
		System.out.println(q.c.x);
		System.out.println(q.c.y);
		System.out.println(q.r);
	}

}
