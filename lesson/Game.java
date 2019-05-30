package jp.co.tafs.lesson;

import java.util.Scanner;

public class Game {
	String b;
	String c;

	boolean powerstate = false;
	Scanner sc = new Scanner(System.in);

	public void GamePlay(String d) {
		System.out.println(d + "で遊びましょう！");
	}

	public boolean powerCheck() {
		System.out.println("電源はonですか、offですか入力してください>");

		c = sc.nextLine();

		if (c.equals("on") && powerstate == false) {
			powerstate = false;
		}
		else {
			powerstate = true;
		}
		return powerstate;
	}

	public String activeGame() {
		System.out.print("アクティブなゲームソフトを入力、無ければnoを入力>");

		b = sc.nextLine();

		if (b.equals("no")) {
			b = null;
		}

		return b;
	}

	public void powerOn() {
		System.out.println("電源ON");
	}

	public void powerOff() {
		System.out.println("電源OFF");
	}

	public void softIn(String str) {
		System.out.println("ゲームソフトを入れましょう");

		str = sc.nextLine();

		System.out.println(str + "を入れました");

		GamePlay(str);
	}

	public void softOut() {
		System.out.println("ゲームソフトOUT");
	}
}

class SuperGameMachine {
	private String gameMashine = "NINTENDO64";
	private String gameMaker = "任天堂";
	private String Internet = "有り";
	private String releaseDate = "2004/4/17";
	private Integer price = 25000;

	public String getGameMashine() {
		return this.gameMashine;
	}

	public String getGameMaker() {
		return this.gameMaker;
	}

	public String getInternet() {
		return this.Internet;
	}

	public String getReleaseDate() {
		return this.releaseDate;
	}

	public Integer getPrice() {
		return this.price;
	}
}
