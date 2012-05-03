package org.eric.study.patterns.flyweight;

public class Main {

	public static void main(String[] args) {

		// Build a document with text
		String document = "AAZZBBZB";
		char[] chars = document.toCharArray();

		CharacterFactory f = new CharacterFactory();

		// extrinsic state
		int pointSize = 10;

		// For each character use a flyweight object
		for (char c : chars) {
			pointSize++;
			Character character = f.GetCharacter(c);
			System.out.println(character);
			character.Display(pointSize);
		}
	}

}
