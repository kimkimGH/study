package study;

public class q1 {
			//ch5-15 String�� �ֿ� �ż���
	public static void main(String[] args) {
		String s="abcde";
		char q=s.charAt(1); //���ڿ����� �����ϳ��� �����ϰ������ .charAt() ()���� index��ȣ�Է�, ���ڿ��������ڷ� 
		System.out.println(q);
		String w=s.substring(0,3); // ���ڿ����� ���ڿ������� �����ϰ������ .subString(n,n) ���������ڴ� ���������ʴ´�
		String e=s.substring(1); // ()�ȿ� �����ϳ��� ������ �׼��ں��� ������ ���´�
		System.out.println(w); 
		System.out.println(e);
	}

}