package tdd;

public class Game {

	private int score = 0;
	private boolean spare = false;
	private int[] deuxLance = new int[2];
	private int numLance = 0;
	private boolean strike = false;
	private int nbrDePointADoubler = 0;

	void roll(int nbQuilles) {
		if (numLance == 2 || (numLance == 1 && deuxLance[0] == 10)) {
			numLance = 0;
		}
		numLance += 1;
		deuxLance[numLance - 1] = nbQuilles;
		if (spare) {
			score += nbQuilles;
			spare=false;
		}
		if (strike) {
			score += nbQuilles;
			nbrDePointADoubler -= 1;
			if (nbrDePointADoubler == 0) {
				strike = false;
			}
		}
			score += nbQuilles;
		if (numLance == 2 && (deuxLance[0] + deuxLance[1] == 10)) {
			spare = true;
			
		} else if (numLance == 1 && (deuxLance[0] == 10)) {
			strike = true;
			nbrDePointADoubler += 2;
			numLance=0;
		}
	}

	int score() {
		return score;
	}

}