package ch1;

public class eee{
	private int x; //(private)����class�ȿ����� ����
			int z; //(default)����class����package ��밡��
	protected int q;//(protected)����class����package�ڼ�class��밡��
	public int w;//(public) ��δ� ��밡��

	public void printMembers() {
		System.out.println(x);
		System.out.println(z);
		System.out.println(q);
		System.out.println(w);
	}
}

class e {
	public static void main(String[] args) {
		eee q=new eee();
		//System.out.println(q.x); //�ٸ�class�� ���Ұ���
		System.out.println(q.z); //(default)����class����package ��밡��
		System.out.println(q.q); //����class����package�ڼ�class��밡��
		System.out.println(q.w); //��δ� ��밡��
	}

}
