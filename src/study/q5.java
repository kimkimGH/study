package study;

class Card{
	String kind; //iv,���ڿ� String
	int number;	//iv,���� int
	static int width=80;//cv,���� 
	static int height=100;//cv,����
}

public class q5 {

	public static void main(String[] args) {
		System.out.println(Card.width);//cv�� ��ü�������̵� ��밡��
		System.out.println(Card.height);//cv�� ��ü�������̵� ��밡��
		
		Card c1=new Card();
		c1.kind="Heart";//����ǥ��
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="spade";//����ǥ��
		c2.number=8;
		System.out.println("ī���ǳ���:"+c1.width+"ī���ǳ���"+c1.height+"ī���ǹ���:"+c1.kind+"����:"+c1.number);
		System.out.println("ī���ǳ���:"+c2.width+"ī���ǳ���"+c2.height+"ī���ǹ���:"+c2.kind+"����:"+c2.number);
		Card.width=50; //c1.width=50; c1���� ����ص� cv�� ��ü������ ����ȴ�,�����ϱ� ������ cv�� ����Ѵ�.
		Card.height=70;
		System.out.println();
		System.out.println("ī���ǳ���:"+c1.width+"ī���ǳ���"+c1.height+"ī���ǹ���:"+c1.kind+"����:"+c1.number);
		System.out.println("ī���ǳ���:"+c2.width+"ī���ǳ���"+c2.height+"ī���ǹ���:"+c2.kind+"����:"+c2.number);
	}

}