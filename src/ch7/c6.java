package ch7;
			//�������� super
class parent1{
	int x=20; //super
}		//���� ������� super����Ѵ�.
class child1 extends parent1{
	int x=30; //this
	void method() {
		System.out.println("x=:"+x); //�������(x)
		System.out.println("this.x=:"+this.x); //class child1
		System.out.println("sufer.x=:"+super.x); //class parent1
	}
}
public class c6 {

	public static void main(String[] args) {
		child1 c=new child1();
		c.method(); //child1�� �ִ� �ż��� ȣ��
	}

}
