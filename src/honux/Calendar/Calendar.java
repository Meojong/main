package honux.Calendar;

import java.util.Scanner;

public class Calendar {

	public static final int mon[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int month(int i) {
		return mon[i - 1];

	}

	public void PrintSampleCalendar() {
		System.out.println(" 일  월    화   수  목   금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복횟수 입력 : ");
		int repeat = sc.nextInt();
		int j;
		
		for (j = 0; j < repeat; j++) {
			System.out.println("월 입력 : ");
			int i = sc.nextInt();
			System.out.println(mon[i - 1] + "일 까지 있습니다.");
		}
		System.out.print("bye~");
		sc.close();
	}
}