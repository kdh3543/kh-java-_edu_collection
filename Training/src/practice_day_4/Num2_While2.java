package practice_day_4;

import java.util.Scanner;

public class Num2_While2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if(num<0||num>99) {
			System.out.println("잘못된 입력입니다.");
		}else {
			int finNum =num;

			int count = 0;
			while(true) {
				count++;

				if(num == 0) {
					break;
				}else {
					int fst = num/10;
					int sec = ((num%10*10) + ((num%10+fst)%10));
					num = sec;
					if(num == finNum) {
						break;
					}
				}
			}
			System.out.println(count);
		}
	}

}
