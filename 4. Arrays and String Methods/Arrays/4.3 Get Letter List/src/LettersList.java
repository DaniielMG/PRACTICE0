public class LettersList {
	public static String[] getLettersList(String word) {
		String[] letters = new String[word.length()];

		for (int i = 0; i < word.length(); i++) {
			letters[i] = String.valueOf(word.charAt(i));
		}

		return letters;
	}
}