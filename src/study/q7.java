package study;

class Data{int x;}

public class q7 {
			//������ �Ű����� �������� ���� �����Ҽ� �ִ�
	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		System.out.println("main x="+d.x);

		change(d); 
		System.out.println("main x="+d.x);
		
	}
	
	
	//�ּҰ���ü�� ����
	static void change(Data s) {//������ �ٲٴ°��� �ƴ϶� Data d�� ��ü���� �����Ѵ�? void�� retrun�� ��������
		s.x=1000;
		System.out.println("change x="+s.x);
	}
	
	
	
}