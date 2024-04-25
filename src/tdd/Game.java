package tdd;

public class Game {

	private int score = 0;
	private boolean spare = false;
	private int[] deuxLance = new int[2];
	private int numLance = 0;

	void roll(int nbQuilles) {
		if (numLance == 2) {
			numLance = 0;
		}
		numLance += 1;
		deuxLance[numLance-1] = nbQuilles;
		if (spare) {
			score += 2 * nbQuilles;
		} else {
			score += nbQuilles;
		}
		if (numLance == 2 && (deuxLance[0] + deuxLance[1] == 10)) {
			spare = true;
		}
	}

	int score() {
		return score;
	}

}
