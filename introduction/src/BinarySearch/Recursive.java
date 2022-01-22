package BinarySearch;

public class Recursive {
	int Recursive(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            
            if (arr[mid] == x)
                return mid;
 
            
            if (arr[mid] > x)
                return Recursive(arr, l, mid - 1, x);
 
           
            return Recursive(arr, mid + 1, r, x);
        }
 
        
        return -1;
    }
 
    public static void main(String args[])
    {
        Recursive ob = new Recursive();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 40;
        int result = ob.Recursive(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
	