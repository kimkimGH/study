package study;

public class q3 {
	public static void main(String[] args) {
		Tv t;//Tv�ν��Ͻ��� �����ϱ� ���� ����t����
		t=new Tv();//Tv�ν��Ͻ��� ����  
//		Tv t=new Tv(); �ٿ����� ����
		t.channel=7;//Tv�ν��Ͻ� �⺸����channel�� ����7������
		t.channelDown();//Tv�ν��Ͻ��� �޼���channelDown()�� ȣ��
		System.out.println("���� Tv�� ä����"+t.channel+"�Դϴ�.");
	}
}
class Tv {
	//Tv�� �Ӽ�(�������)
	String color; //����
	boolean power; //��������
	int channel; //ä��

	void power() {power =!power;} //Tv�� on/off
	void channelup() {++channel;} //Tv�� ä���� ���̴±��
	void channelDown() {--channel;}//Tv�� ä���� ���ߴ±��

}