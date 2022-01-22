package BinarySearcgRecurssive;

public class BinarySearchRecursive {

	public static int BinarySearchRecursive(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return BinarySearchRecursive(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return BinarySearchRecursive(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {34,67,76,110,21};  
        int key = 110;  
        int last=arr.length-1;  
        int result = BinarySearchRecursive(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  