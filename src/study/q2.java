package study;
import java.util.*;
public class q2 {
	//Arrays�� �迭 �ٷ��
	public static void main(String[] args) {
		int[] score= {11,55,25,58,96};
		int[][] score1= {
				{25,56},
				{57,92}
		};
		System.out.println(Arrays.toString(score)); //tostring �Ѱ��� �迭�϶� ���
		System.out.println(Arrays.deepToString(score1)); //deepToString 2�����迭�϶� ���
		//Arrays.toString ���ڹ迭�� �����Ҷ����
		System.out.println();
		
		String[][] str= {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str1= {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.deepEquals(str,str1));//2�������ڹ迭 ���Ҷ� Arrays.deepEquals���
		
		System.out.println();
		
		String[] s= {"qqq","www","eee"};
		String[] s1= {"qqq","www","eee"};
		System.out.println(Arrays.equals(s,s1));// �迭�϶� Arrays.equals ���
		System.out.println();
		int[] arr= {0,1,2,3,4,5};

		int[] arr1=Arrays.copyOf(arr,3); //Arrays.copyOf(arr,3) arr�� ī���ؼ� 3������ ���� ��Ÿ���� copy�� index 0�� �����ϰ� 1���ͽ���
		int[] arr2=Arrays.copyOf(arr,arr.length); //Arrays.copyOf(arr.arr.length) arr�� ī���ؼ� arr.length��ŭ ��Ÿ����
		int[] arr3=Arrays.copyOf(arr,7); //(arr,7) arrī���ؼ� 7������Ÿ���� ���ڰ� ���°�� 0���� ǥ���Ѵ�. 
		int[] arr4=Arrays.copyOfRange(arr,2,4); //(arr,2,4) arrī���� 2����3���� ���� ��Ÿ���� 4�� �������� �ʴ´�, range�� index�� 0����
		int[] arr5=Arrays.copyOfRange(arr,2,8); //(arr,2,8) arrī���� 2����7���� ���� ��Ÿ���� 8�� �������� �ʰ� �������� 0���� ǥ��
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
		System.out.println();
		
		int[] qq= {2,1,5,4,3,0};
		Arrays.sort(qq); //������ ������� �����Ѵ�
		System.out.println(Arrays.toString(qq));

	}


}