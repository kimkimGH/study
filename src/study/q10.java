package study;
	//ī������������?
class Data3{int x;}

public class q10 {

	public static void main(String[] args) {
		Data3 d=new Data3();
		d.x=15;
		System.out.println("main"+d.x);
		Data3 d2=copy(d);//Data d2 ���� ������ �����ϱ�
		System.out.println("after copy:"+d2.x);
	}
	
	static Data3 copy(Data3 d) {
		Data3 tem=new Data3();
		tem.x=d.x;
		System.out.println("copy:"+tem.x);
		return tem;
	}
}


// �ż��� ��: add,random,round,print �����͵� (���)���� 
//�޼��� �̸��̰��� :�ϴ� �۾��� ����. ���� �۾��� �����ϴ°ܿ� �����ε�
//������: iv�ʱ�ȭ �ż��� 
// �̸��� Ŭ���� �̸��� ��ġ�ؾ��Ѵ�,���ϰ��̾���(void�Ⱥ���),��� Ŭ������ �ݵ�� �����ڸ� �������Ѵ�.