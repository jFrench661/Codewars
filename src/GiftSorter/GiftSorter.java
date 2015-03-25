package GiftSorter;

import java.util.Arrays;

public class GiftSorter {
	
	public static void main(String[] args){
		System.out.println(sortGiftCode("bacyxz"));
	}

	//alphabetizes and returns a string
	public static String sortGiftCode(String code) {
		char[] chars = code.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		return sorted;
	}
}