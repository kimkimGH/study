package ch7;
		//다형성
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
		//Tv1 t=new SmartTv1(); //조상타입참조 변수로 자손타입객체를 다루는것(다형성)허용
		//SmartTv1 v=new Tv1(); 에러 허용안됨 
//	SmartTv s=new SmartTv(); //참조변수와 인스턴스의 타입일치 (가능)
//	Tv t=new SmartTv(); //조상타입참조변수와 자손타입인스턴스참조 (가능)	
	}

}
