package ch7;
								//object toString
class Point2 {//2������ǥ
	int x;
	int y;
	public String toString() {
		return "x:"+x+",y:"+y;
	}
}	
class Point4d extends Point2{
	int z;
	public String toString() {//objectŬ������ toString()���� �������̵�
		return "x:"+x+",y:"+y+",z:"+z;
	}
}	
public class c4 {
	public static void main(String[] args) {
		Point4d w=new Point4d();
		w.x=1;
		w.y=2;
		w.z=3;
		System.out.println(w);
	}

}
