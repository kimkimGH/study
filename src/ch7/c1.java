package ch7;

class Tv{
	boolean power;	//����
	int channel;	//ä��
	
	void power() {power=!power;}	//����on/off
	void channelUp() {channel++;}	//ä��up
	void channelDown() {channel--;} //ä�� Down
}

class SmartTv extends Tv{	//Tv�κ��� iv�� �޼��带 ��ӹ��� 
	boolean caption;
	void displayCaption(String text) {
		if(caption)
			System.out.println(text);
	}
	
}

public class c1 {

	public static void main(String[] args) {
		SmartTv st=new SmartTv();
		st.channel=7;	//Tv���� ����� �޾ұ� ������ ��밡�� 
		st.channelDown();//Tv���� ��ӹ��� �޼���
		st.power();// Tv on
		st.power();// Tv off
		System.out.println(st.power);
		System.out.println(st.channel);
		
	}

}
