package ch7;
			//super() ������
class point3 extends Object{
	int x,y;
	
	point3(int x,int y){
		super(); //super(),this()ȣ���ϱ� �⺻�������ۼ��� �ʼ� 
		this.x=x;
		this.y=y;
	}
}
class point3d2 extends point3{
	int z;
	point3d2(int x,int y,int z){
		super(x,y); //����Ŭ���� ������point(int x,int y)�� ȣ�� 
		this.z=z; //�ڽ��� ����� �ʱ�ȭ
	}
	public String toString() {
		return "x:"+x+"y:"+y+"z:"+z;
	}
}
public class c8 {

	public static void main(String[] args) {
		point3d2 p=new point3d2(1,2,3);
		System.out.println(p.toString());
	}

}
