public class OccurenceCharacter {

	public static int numberOccurrenceIn(String word, char letter) {
		int count = 0;
		
		for(int index = 0; index < word.length(); index++) {
			if(letter == word.charAt(index)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String word = "Hello World";
		char letter = 'o';
		System.out.print(numberOccurrenceIn(word, letter));
	}
}