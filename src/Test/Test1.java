package Test;
//ȣ�� ����
import java.util.Scanner;
class score{
	int add(int x,int y){return x+y;}
	int sub(int x,int y) {return x-y;}	
	int mult(int x,int y) {return x*y;}	
	int divi(int x,int y) {return x/y;}	
}	
public class Test1 {
	public static void main(String[] args) {
		while(true) {
			score f=new score(); 
			Scanner sc=new Scanner(System.in);
			System.out.println("0.���� 1.���ϱ� 2.���� 3.���ϱ� 4.������");
			System.out.print("�޴�����:");
			int num1=sc.nextInt();
			if(num1==0) {System.out.println("�ý�������"); break;}
			else if(num1>5) {System.out.println("�߸��Է��ߴ�."); continue;}
			System.out.print("�����Է�:");
			int x=sc.nextInt();
			System.out.print("�����Է�:");
			int y=sc.nextInt();
			if(num1==1) {System.out.println(f.add(x, y));}
			else if(num1==2) {System.out.println(f.sub(x, y));}
			else if(num1==3) {System.out.println(f.mult(x, y));}
			else if(num1==4) {System.out.println(f.divi(x, y));}
			else if(num1==0) {System.out.println("�ý�������"); break;}
			else if(num1>5) {System.out.println("�߸��Է��ߴ�."); continue;}
		}
	}
}

