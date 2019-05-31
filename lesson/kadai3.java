package jp.co.tafs.python;

import java.util.Scanner;

public class kadai3 {
	public static void main(String[] args) {
		int x = 0; //赤の数
		int y = 0; //黄色の数
		int z = 0; //青の数
		String s; //ボールの色
		String exit;
		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		while (flag == true) {
			System.out.println("箱にボールがありますか？");
			System.out.println("yes_OR_no＞");
			exit = sc.nextLine();

			if (exit.equals("yes")) {
				System.out.println("何色ですか？");
				System.out.println("red、yellow、blueで入力してください＞");
				s = sc.nextLine();
				if (s.equals("red")) {
					x = x + 1;
				}
				else if (s.equals("yellow")) {
					y = y + 1;
				}
				else {
					z = z + 1;
				}
			}
			else {
				System.out.println(x + "個" + y + "個" + z + "個");
				System.out.println("処理を終了します。");
				flag = false;
			}

		}

		sc.close();
	}
}
