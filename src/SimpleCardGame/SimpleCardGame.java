package SimpleCardGame;

import java.util.Map;

public class SimpleCardGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] steve = { "A", "7", "8" };
		String[] josh = { "2", "5", "9"};
		System.out.println(winner2(steve, josh));

	}

	public static String winner(String[] deckSteve, String[] deckJosh) {
		int[] steveScores = value(deckSteve);
		int[] joshScores = value(deckJosh);
		int steveScore = 0;
		int joshScore = 0;

		for (int i = 0; i < steveScores.length; i++) {
			if(joshScores[i] > steveScores[i]){
				joshScore++;
			}else if(joshScores[i] < steveScores[i]){
				steveScore++;
			}
		}
		
		if(steveScore > joshScore){
			return String.format("Steve wins %d to %d", steveScore, joshScore);
		}else if(steveScore < joshScore){
			return String.format("Josh wins %d to %d", joshScore, steveScore);
		}else{
			return "Tie.";
		}
		
	}

	public static int[] value(String[] cards) {
		int[] values = new int[cards.length];
		String[][] key = { { "T", "10" }, { "J", "11" }, { "Q", "12" },{ "K", "13" }, { "A", "14" } };
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].matches("[-+]?\\d*\\.?\\d+")) { // if card face is a number
				values[i] = Integer.parseInt(cards[i]);
			} else {
				for (int j = 0; j < key.length; j++) {
					if (cards[i].matches(key[j][0])) {
						values[i] = Integer.parseInt(key[j][1]);
					}
				}
			}
		}

		return values;
	}
	
	 
		//better, shorter way to do the same thing as the other 2 functions
	    public static String winner2(String[] deckSteve, String[] deckJosh) {
	    	String cards = "23456789TJQKA";
	        int score1 = 0;
	        int score2 = 0;
	        for (int i = 0; i < deckSteve.length; ++i) {
	            int v1 = cards.indexOf(deckSteve[i]) - cards.indexOf(deckJosh[i]);
	            if (v1 < 0) {
	                score2++;
	            } else if (v1 > 0) {
	                score1++;
	            }
	        }
	        if (score1 > score2) {
	            return "Steve wins " + score1 + " to " + score2;
	        } else if (score2 > score1) {
	            return "Josh wins " + score2 + " to " + score1;
	        } else {
	            return "Tie";
	        }
	    }
	
	
	

}
