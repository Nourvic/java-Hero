import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean againspielen= true;
		while(againspielen) {
		int num = 0;
	
		do {
			System.out.println("21 - Black Jack ");
			System.out.println("1 - Ein Spieler ");
			System.out.println("2 - zwei Spieler ");
			System.out.println("3 - Programm enden");
			num = in.nextInt();
		} while (num < 1 || num > 3);

		switch (num) {
		case 1: {
			
			SpielFeld s = new SpielFeld(0, 0);
			System.out.println("Geben Sie bitte den Name des Spieler ein");
			String eingabe = in.next();
			Spieler player1 = new Spieler(eingabe);
			System.out.println("Runde 1 :");
			System.out.println(player1.getName() + "ist an der Reihe");
			boolean again = true;
		  	player1.setScore(0);
			 s.setAiScore(0);
			
			while(!s.isGameOverSpieler(player1, s.getAiScore())) {

				int spielrnumScore = 0;
			while (again) {
				 spielrnumScore += player1.spielerWuerfel();
				System.out.println(player1.getName() + " hat eine " + spielrnumScore + " gewuerfelt");
				System.out.println(player1.getName() + " Aktuelle Score ist  " + spielrnumScore);
				System.out.println();
				if (spielrnumScore > 21) {
					System.out.println("oh schade uber 21 du hast 0 punkte");
					player1.setScoreF(0);
					again = !again;
				}
				else if (spielrnumScore== 21){
					System.out.println("du hast 21 !! du hast +42 punkte");
					player1.setScoreF(42);
					
				}else  {
					System.out.println("mochten sie nochmal wurfeln  (j or n)");
					String eing = in.next();
					if (!player1.playAgain(eing)) {
					
						player1.setScoreF(spielrnumScore);
						again = !again;
					}
				}
			}

		System.out.println("computer jzt ist an der reihe ");
		
		int aiwurfel = s.Aiwuerfel();
		System.out.println("computer hat "+aiwurfel+" punkte");
		s.setScoreAF(aiwurfel);
		int scorefAi = s.getScoreAF();
		
		if (scorefAi>player1.getScoreF()) {
			
			s.addScoreAi(scorefAi);
			player1.setScoreF(0);
			s.setScoreAF(0);
			
		}else {
			player1.addScore(player1.getScoreF());
			s.setScoreAF(0);
			player1.setScoreF(0);
		}
		System.out.println("die aktulle score ist ");
		System.out.println( player1.getName()+" score ist "+player1.getScore());
		System.out.println("computer score ist "+ s.getAiScore());
		again = !again ;
		System.out.println();

		}if (player1.getScore()>s.getAiScore()) {
			System.out.println(player1.getName() + "hat gewonnen !");
		}else {
			System.out.println(  " computer hat gewonnen !");
		}
			
			
			
			
			
			System.out.println("mochten sie nochmal spielen  j or n");
			String d = in.next();
			if (d.charAt(0)=='n') {
				System.out.println("spiel beendet");
			
				againspielen= false;
				break ;	
			}
			}
		
			
			
		
	
		case 2 : {
			
			SpielFeld s = new SpielFeld(0, 0);
			System.out.println("Geben Sie bitte den Name des Spieler ein");
			String eingabe = in.next();
			Spieler player1 = new Spieler(eingabe);
			System.out.println("Geben Sie bitte den Name des Spieler 2  ein");
			String eingabe2 = in.next();
			Spieler player2 = new Spieler(eingabe2);
			boolean tur= true ;
			System.out.println("Runde 1 :");
		 	player1.setScore(0);
		  	player2.setScore(0);
		  	while(!s.isGameOverSpieler(player1, player2)) {
		  		int spielrnumScore = 0;
		  		boolean again = true ;
		  		Spieler current=null;
				while (again) {
					 current = player1;
					System.out.println(current.getName() + " ist an der Reihe");
					 spielrnumScore += current.spielerWuerfel();
					System.out.println(player1.getName() + " hat eine " + spielrnumScore + " gewuerfelt");
					System.out.println(player1.getName() + " Aktuelle Score ist  " + spielrnumScore);
					System.out.println();
					if (spielrnumScore > 21) {
						System.out.println("oh schade uber 21 du hast 0 punkte");
						current.setScore(0);
						current.setScoreF(0);
						again = !again;
					}
					else if (spielrnumScore== 21){
						System.out.println("du hast 21 !! du hast +42 punkte");
						current.setScoreF(42);
						
					}else  {
						System.out.println("mochten sie nochmal wurfeln j or n");
						String eing = in.next();
						if (!current.playAgain(eing)) {
						
							current.setScoreF(spielrnumScore);
							tur=!tur;
							again = !again;
							current = tur? player1 : player2 ;
						}
					}
				}
				boolean again1= true;
				while (again1) {
					 spielrnumScore += current.spielerWuerfel();
					System.out.println(current.getName() + " hat eine " + spielrnumScore + " gewuerfelt");
					System.out.println(current.getName() + " Aktuelle Score ist  " + spielrnumScore);
					System.out.println();
					if (spielrnumScore > 21) {
						System.out.println("oh schade uber 21 du hast 0 punkte");
						current.setScore(0);
						current.setScoreF(0);
						again1 = !again1;
					}
					else if (spielrnumScore== 21){
						System.out.println("du hast 21 !! du hast +42 punkte");
						current.setScoreF(42);
						
					}else  {
						System.out.println("mochten sie nochmal wurfeln");
						String eing = in.next();
						if (!current.playAgain(eing)) {
						
							current.setScoreF(spielrnumScore);
							tur=!tur;
							current = tur? player1 : player2 ;
							again1=!again1;
						}
					}
				}
				System.out.println("die aktulle score ist ");
				System.out.println( player1.getName()+" score ist "+player1.getScore());
				System.out.println( player2.getName()+" score ist "+player2.getScore());
				System.out.println();

		}
			if (player1.getScore()>player2.getScore()) {
				System.out.println(player1.getName() + "hat gewonnen !");
			}else {
				System.out.println(player2.getName() + "hat gewonnen !");
			}
			

}
		case 3 :{
			System.out.println("programm beendet");
			againspielen=false;
			break;
		}}}}}