package practice_day_2;

import java.util.Scanner;

public class Num5_if_Alaram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �˶� �����ϴ� ���α׷�");
		System.out.print("������ �˶��� �ð�: ");
		int h = sc.nextInt();
		System.out.print("������ �˶��� ��: ");
		int m = sc.nextInt();

		if(0<=h&&h<=23&&0<=m&&m<=59) {
			if(m-45>=0) {
					System.out.println(h+" "+(m-45));
			}else {
				if(h-1<0) {
					System.out.println((h+23)+" "+(m+15));
				}else
					System.out.println((h-1)+" "+(m+15));
			}
		}else
			System.out.println("�ð��� �߸� �Է��ϼ̽��ϴ�.");
	}
}