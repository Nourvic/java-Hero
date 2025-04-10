import java.util.Random;
import java.util.Scanner;

public class SpielFeld {
    private int aiScore;
    private int ScoreAF;

    public int getScoreAF() {
        return ScoreAF;
    }

    public void setScoreAF(int scoreAF) {
        ScoreAF = scoreAF;
    }

    public SpielFeld(int aiScore, int scoren) {
        super();
        this.aiScore = 0;
        this.ScoreAF = 0;
    }

    Random rd = new Random();
    Scanner in = new Scanner(System.in);

    public int spielerWuerfel() {
        int x = rd.nextInt(6) + 1;
        return x;
    }

    public int Aiwuerfel() {
        int x = rd.nextInt(6) + 1;
        int sum = 0;
        while (sum <= 14) {
            sum += x;
        }
        return sum;

    }


    public int getAiScore() {
        return aiScore;
    }

    public void setAiScore(int aiScore) {
        this.aiScore = aiScore;
    }

    public void addScoreAi(int s) {
        aiScore += s;

    }

    public boolean playAgain(String b) {
        boolean again = false;
        char a = b.charAt(0);
        if (a == 'j') {
            again = true;
        } else if (a == 'n') {
            again = false;
        }
        return again;

    }

    public boolean checkPlayerScoreBigger(Spieler p, int ScoreAF) {
        if (p.getScoreF() > ScoreAF) {
            return true;

        }
        return false;
    }

    public void saveScore(Spieler p, int ScoreAF) {
        if (checkPlayerScoreBigger(p, ScoreAF)) {
            p.setScore(p.getScoreF());
            p.setScoreF(0);
        }
    }

    public void savek(int x) {
        this.ScoreAF += x;
    }

    public boolean isGameOverSpieler(Spieler p, int cScore) {
        if (p.getScore() >= 100 || cScore >= 100) {
            return true;
        } else
            return false;

    }

    public boolean isGameOverSpieler(Spieler p, Spieler p1) {
        if (p.getScore() >= 100 || p1.getScore() >= 100) {
            return true;
        } else
            return false;

    }

}
