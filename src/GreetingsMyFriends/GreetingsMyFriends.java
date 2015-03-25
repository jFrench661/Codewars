package GreetingsMyFriends;

public class GreetingsMyFriends {
	
	public static void main(String[] args){
		String[] friends = {"Mary", "Sally"};
		String[] x = null;
		String[] y = new String[0];
		System.out.println(greetingForAllFriends(friends));
		System.out.println(greetingForAllFriends(x));
		System.out.println(greetingForAllFriends(y));
	}

	public static String[] greetingForAllFriends(String... friends) {
		if (friends == null || friends.length == 0) {
			return null;
		} else {
			String[] greetings = new String[friends.length];
			for (int i = 0; i < friends.length; i++) {
				greetings[i] = String.format("Hello, %s!", friends[i]);
			}

			return greetings;

		}
		
    
  }

}