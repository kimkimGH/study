package ch7;
		//�������� super
class parent2{int x=10;}//super/this �Ѵٻ�밡�� �ߺ��϶� �ȵ�

class child2 extends parent2{
	void method() {
		System.out.println("x=:"+x); //������� x�� ����
		System.out.println("this.x=:"+this.x);	//child�� x�� ���⶧���� perent2��x�� ����
		System.out.println("super.x=:"+super.x);//perent2�� x
	}
}

public class c7 {

	public static void main(String[] args) {
		child2 c=new child2();
		c.method();
	}

}
