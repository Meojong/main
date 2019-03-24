package honux.Calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first, second, tot;
		System.out.printf("첫번째 숫자 입력 : ");
		first = sc.nextInt();
		System.out.printf ("두번째 숫자 입력 : ");
		second = sc.nextInt();
		tot = first + second;
		System.out.printf(first + " + " + second + " = " + tot);
		sc.close();
	}

}
