package org.lessons.java.charscounter;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class BrokenWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci una parola:");
		String word = sc.nextLine();
		
		Map<Character, Integer> charFreq = new HashMap<>();
	
		
		for (Character c : word.toLowerCase().toCharArray()) {
			
			if (charFreq.containsKey(c)) {
				
				charFreq.put(c, charFreq.get(c) + 1);
			} else {
				
				charFreq.put(c, 1);
			}
			
		}
		
		System.out.println(charFreq);
	}
}
