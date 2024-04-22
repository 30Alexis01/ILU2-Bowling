package tdd;

public class Game {
	
	int score=0;
	
	public void game(int score) {
		this.score =score;
	}
	
	void roll (int nbQuilles) {
		score += nbQuilles;
	}
	
	int score() { 
		return score;
	}
}
