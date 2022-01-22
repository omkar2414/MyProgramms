package practice;

public class All {

	public static void main(String[] args) {
		
		String s="omkarbhosale";
		
		
		char String[]=s.toCharArray();
		System.out.println("Length"+String.length);
		System.out.println("Duplicate character in a string:");
		
		for(int i=0; i<String.length; i++) {
			
			for(int j=i+1; j<String.length; j++) {
				if(String[i]==String[j] && String[i] != ' ') {
					
					String[j]='0';
				}
			}
			if(String[i] !='0') {
				System.out.println(String[i]);
			}
		}
	}
}

