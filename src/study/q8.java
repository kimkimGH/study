package study;

class Data1{int x;}

public class q8 {
		//�⺻�� �Ű����� �⺻���� ���� �б⸸ �Ҽ� �ִ�
	public static void main(String[] args) {
		Data1 d=new Data1();
		d.x=11;
		System.out.println("main x="+d.x);
		
		change(d.x);
		System.out.println("after main x="+d.x);
	}
	static void change(int x) {
		x=100;
		System.out.println("change x="+x);
	}
}