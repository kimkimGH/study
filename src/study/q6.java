package study;

public class q6 {

	public static void main(String[] args) {
		Math m=new Math();
		int i=m.add(2,5);
		int q=m.b(5,4);
		int w=m.c(5,4);
		int r=m.d(5,4);
		int f=m.s(4,6);
		m.gugudan(11);
		
		System.out.println(i);
		System.out.println(q);
		System.out.println(w);
		System.out.println(r);
		System.out.println(f);

	}

}

class Math{
	int add(int x,int y) {return x+y;} //�ż���� calss�������� ���ǰ��� ,�ż����? {} 
	int b(int x,int y) {return x-y;}
	int c(int x,int y) {return x*y;}
	int d(int x,int y) {return x/y;}
	int s(int x,int y) {	//int s(int x,int y){if(x<y) return y; else return x;} �̷��Ե� ��밡��
		if(!(x<y)) //if�� ���� ��ȯ���� true���̶�false���Ѵ� �������� else�������ҽ� ����/ !����ϸ� ū���̾ƴ� �������̳���
			return y;
		else 
			return x;
	}
	void gugudan(int dan) { //void �� �����Ѵٸ������� return ��������,void�� �ƴϸ� �ݵ�� retrun���
		if(!(2<=dan && dan<=9))//���� 2~9���ƴϸ� return����
			return;
			for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d%n",dan,i,dan*i);
					
		}
	}

	
	
	
	
	
}