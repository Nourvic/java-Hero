import java.util.Random;

public class Spieler {
	private String name;
	private int score;
	private int scoreF;
	Random rd = new Random();


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		this.score=0;
		this.scoreF=0;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public void addScoreAi(int s) {
		score += s;

	}

	public Spieler(String name) {
		this.name = name;
	}

	public void addScore(int s) {
		this.score += s;
	}

	public int getScoreF() {
		return scoreF;
	}

	public void setScoreF(int scoreF) {
		this.scoreF = scoreF;
	}
	public int spielerWuerfel() {
		int x = rd.nextInt(6) + 1;
        this.scoreF =x;
		return x;

	}
	public boolean playAgain(String b) {
		boolean again = false;
		char a = b.charAt(0);
		if (a == 'j') {
			again = true;
		} else {
			again = false;
		}
		return again;

	}
}
