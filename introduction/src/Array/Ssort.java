package Array;

public class Ssort {

	public static void main(String[] args) {
		
		int a[] = {6,8,3,9,2,7};
		int n = a.length;
		
		for(int i = 0; i<n-1;i++) {
			int minInd = i;
			for(int j = i; j<n; j++) {
				if(a[j] < a[minInd]) {
					minInd = j;
				}
			}
			int temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;
			
		}
		for(int e: a) {
			System.out.print(e +" ");
		}
	}

}
