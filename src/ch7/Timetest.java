package ch7;
		//ĸ��ȭ
class Time{
	private int hour; //TimeŬ���������� ��밡��
	private int minute;//TimeŬ���������� ��밡��
	private int second;//TimeŬ���������� ��밡��
	
	public void sethour(int hour) {
		if(hour<0||hour>23) return;
		
		this.hour=hour;
	}
	
	public int gethour() {
		return hour;
	}
	
	
}
public class Timetest {

	public static void main(String[] args) {
		Time t=new Time();
		t.sethour(5);
		System.out.println(t.gethour());
		t.sethour(25);
		System.out.println(t.gethour());
		
	}

}
