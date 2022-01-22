package String;

public class AnagramString {

	public static void main(String[] args) {
		
		String a = "ebc";
		String b = "ebc";
		boolean isAnagram = false;
		boolean visited[] = new boolean[a.length()];
		
		if(a.length() == b.length()) {
			
		
			for(int i = 0; i<a.length(); i++) {
				int c = a.charAt(i);
				isAnagram = false;
				for(int j = 0; j<b.length(); j++) {
					if(b.charAt(j) == c && !visited[j]) {
						visited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
		
		}
		if(isAnagram) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}		
	}
}
