package jp.co.tafs.lesson;

import java.util.List;

public class IanGamePlayer {
	public static void main(String[] args) {
		boolean bl;
		List<String> gameSoft;
		String SGM;
		int num;

		SuperGameMachine sgm = new SuperGameMachine();
		System.out.println(sgm.getGameMashine());
		System.out.println(sgm.getGameMaker());
		System.out.println(sgm.getInternet());
		System.out.println(sgm.getReleaseDate());
		System.out.println(sgm.getPrice());

		Game gameplay = new Game();
		Game2 game2 = new Game2();

		bl = gameplay.powerCheck();

		if (bl == false) {
			gameplay.powerOn();
			bl = true;
		}
		else {
			System.out.println("電源はすでにONです");
		}

		game2.softIn();

		gameSoft = game2.gameList();

		System.out.println("インストールしたゲーム機の一覧を表示します");

		for (int i = 0; i < gameSoft.size(); i++) {
			System.out.println(gameSoft.get(i));
		}

		game2.softChoose();

		gameplay.GamePlay();

	}
}