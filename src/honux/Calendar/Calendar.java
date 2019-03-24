package honux.Calendar;

import java.util.Scanner;

public class Calendar {
	public static void main (String[] args) {
		System.out.println(" 일  월    화   수  목   금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();

		int mon[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.print(mon[i - 1]);
		sc.close();
		//배열 생성해 할당하면(초기화) 배열의 주소가 들어가게 된다.
	}
}