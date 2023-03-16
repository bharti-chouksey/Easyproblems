package LeetCode;

public class Ransom {
	public boolean canConstruct(String ransomNote, String magazine) {
		// Initialize an array of count with the size 26...
		int counter[] = new int[128];
		for (final char ch : magazine.toCharArray()) 
			++counter[ch];
		
		for (final char ch : ransomNote.toCharArray())
			if (--counter[ch] < 0)
				return false;

		return true;

	}

	public static void main(String[] args) {
		Ransom ransom = new Ransom();
		System.out.println(ransom.canConstruct("aa", "asab"));
	}

}
