package ch7;
							//�������̵�
class Point1 {//2������ǥ
	int x;
	int y;
	String getLocation() {//getLocation�������� ���ڷ� ��Ÿ���� ����
		return "x:"+x+",y:"+y;
	}
}	
class Point3d extends Point1{//3������ǥ
	int z;

	String getLocation() {//�������̵�(���븸 ���氡��,����� ����Ұ�)
		return "x:"+x+",y:"+y+",z:"+z;
	}
}
public class c3 {

	public static void main(String[] args) {
		Point3d w=new Point3d();
		w.x=1;
		w.y=2;
		w.z=3;
		System.out.println(w.getLocation());
	}

}
