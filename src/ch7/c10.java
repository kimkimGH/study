package ch7;
		//������
public class c10 {
class Tv1{
	boolean power;
	int channel;
	
	void power() {power=!power;}
	void channelup() {channel++;}
	void channelDown() {channel--;}
}
class SmartTv1 extends Tv1{
	String Text;
	void caption() {}
}
	public static void main(String[] args) {
		//Tv1 t=new SmartTv1(); //����Ÿ������ ������ �ڼ�Ÿ�԰�ü�� �ٷ�°�(������)���
		//SmartTv1 v=new Tv1(); ���� ���ȵ� 
//	SmartTv s=new SmartTv(); //���������� �ν��Ͻ��� Ÿ����ġ (����)
//	Tv t=new SmartTv(); //����Ÿ������������ �ڼ�Ÿ���ν��Ͻ����� (����)	
	}

}
