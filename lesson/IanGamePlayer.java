package jp.co.tafs.lesson;

public class IanGamePlayer {
	public static void main(String[] args) {
		boolean bl;
		String gameSoft;
		String SGM;
		int num;

		SuperGameMachine sgm = new SuperGameMachine();
		SGM = sgm.getGameMashine();
		System.out.println(SGM);

		SGM = sgm.getGameMaker();
		System.out.println(SGM);

		SGM = sgm.getInternet();
		System.out.println(SGM);

		SGM = sgm.getReleaseDate();
		System.out.println(SGM);

		num = sgm.getPrice();
		System.out.println(num);

		Game gameplay = new Game();

		bl = gameplay.powerCheck();

		if (bl == false) {
			gameplay.powerOn();
			bl = true;
		}
		else {
			System.out.println("電源はすでにONです");
		}

		gameSoft = gameplay.activeGame();

		if (gameSoft == null) {
			gameplay.softIn(gameSoft);
		}
		else {
			System.out.println(gameSoft + "が入っています");
		}
		if (gameSoft != null) {
			gameplay.GamePlay(gameSoft);
		}
	}
}