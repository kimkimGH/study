package ch2;

import ch1.eee;

class ff extends eee{ //import���ֱ�
	public void printMembers() {
	//	System.out.println(x); ����Ŭ������ ����
	//	System.out.println(z); ����Ŭ������ ������Ű��������
		System.out.println(q); //�ڼ��̶� ����
		System.out.println(w);
	}
}

public class aaa {

	public static void main(String[] args) {
		eee q=new eee();
//		System.out.println(q.x); ����
//		System.out.println(q.z); ����
//		System.out.println(q.q); ���� 
		System.out.println(q.w); //����
		
		
	}

}
