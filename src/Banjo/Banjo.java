package Banjo;

public class Banjo {

	public static void main(String[] args) {
		
		System.out.println(areYouPlayingBanjo("Yed"));
		System.out.println(areYouPlayingBanjo("red"));
		
	}

	public static String areYouPlayingBanjo(String name) {
		String phrase = "";
		if(name.toLowerCase().charAt(0) ==  'r'){
			phrase = name + " plays banjo";
		}else{
			phrase = name + " does not play banjo";
		}
		
		return phrase;
	}
}