package jp.co.tafs.python;

import java.util.Scanner;

public class kadai2_pro {

	Scanner sc = new Scanner(System.in);

	boolean flag = false;
	int num;

	public void input() {
		while (flag == false) {
			System.out.println("1000～9999の数字を入力してください＞");
			num = sc.nextInt();

			if (num <= 1000 && num >= 9999) {
				continue;
			}
			else {
				flag = true;
			}
		}

		if (num != 9999) {
			if (num % 4 == 0) {
				if (num % 100 == 0 && num % 400 == 0) {
					System.out.println("うるう年である");
				}
				else {
					System.out.println("うるう年ではない");
				}
			}
			else {
				System.out.println("うるう年ではない");
			}
		}
		else {
			System.out.println("処理を終了します");
		}

	}
}
