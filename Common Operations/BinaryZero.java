import java.util.Scanner;

public class BinaryZero {
/*
 ��Ŀ���ݣ�
������ڲ��ö�������������е�ֵ��һ��ʮ���Ƶ����֣�����18����һ��32λ�ļ�����ڲ������Ϊ00000000000000000000000000011000�����Կ�������������������ڵ�һ��1֮ǰ����27��0�����ǰ���Щ0����ǰ�����㡣
���ڣ����������дһ����������һ�������������32λ�����Ʊ������ǰ������ĸ�����

�����ʽ:
һ����������32λ���������Ա��ķ�Χ�ڡ�

�����ʽ��
һ��������������뱻���Ϊһ��32λ�Ķ�������ʱ���ڵ�һ��1֮ǰ��0������

����������
256

���������
23
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
//		int[] array = new int[32];
		int count = 0;
		
//		for (int i = 0; i < 32; i++) {
//			array[i] = 0;
//		}
		

		for (int i = 0; i < 32; i++) {
			if(input/2 != 0 && input%2 == 0) {
//				array[i] = 0;
				input = input/2;
				count++;
			}if(input%2 == 1) {
//				array[i] = 1;
				input = input/2;
				count++;
			}if(input/2 == 0) {
				break;
			}
		}
//		for (int k : array) {
//			System.out.print(k + " ");
//		}
		System.out.println(32-count);
	}

}
