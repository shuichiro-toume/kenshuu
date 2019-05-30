package jp.co.tafs.lesson;

import java.util.ArrayList;
import java.util.List;

public class Game2 extends Game {
	List<String> list = new ArrayList<String>();

	boolean flag = false;
	int num;
	String str;

	public void softIn() {
		System.out.println("好きなゲームソフトを5本インストールしましょう");
		System.out.println("インストールを終了する場合はnoを入力してください");

		for (; list.size() < 5;) {
			System.out.println("ゲームタイトルかnoを入力してください＞");
			str = sc.nextLine();
			flag = false;

			if (list.size() != 0) {
				for (int j = 0; j < list.size(); j++) {
					//System.out.println(j);
					//System.out.println(list.get(j));

					if (str.equals(list.get(j))) {
						flag = true;
						break;
					}
				}
			}

			if (flag == true) {
				System.out.println("このゲームソフトはインストール済みです");
				continue;
			}

			if (str.equals("no")) {
				System.out.println("インストールを終了します");
				break;
			}
			else {
				list.add(str);

			}

		}
	}

	public void softOut() { //先頭の要素にデータがあれば先頭を削除、無ければスルー
		if (list.get(0) != null) {
			list.remove(0);
		}
	}

	public void softOut(String soft) { //指定のゲームソフトをインストール済みから削除
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == soft) {
				list.remove(i);
			}
		}
	}

	public List gameList() { //配列でインストール済みゲームソフトの一覧を取得

		return list;

	}

	public void softChoose() {
		System.out.println("何番目のゲームソフトにしますか？");
		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println(list.get(0) + "にしました");
			break;

		case 2:
			System.out.println(list.get(1) + "にしました");
			break;

		case 3:
			System.out.println(list.get(2) + "にしました");
			break;

		case 4:
			System.out.println(list.get(3) + "にしました");
			break;

		case 5:
			System.out.println(list.get(4) + "にしました");
			break;
		}
	}

	public void activeGame(String active) {
		for (int i = 0; i < list.size();) {
			if (list.isEmpty() == false) {
				System.out.println(list.get(i));
			}
			else {
				System.out.println("アクティブなゲームソフトはないです");
			}
		}
	}

}
