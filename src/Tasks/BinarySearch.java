package Tasks;

public class BinarySearch {

	public static int binarySearchRecursive(int array[], int num, int l, int r){
        if (array == null || array.length == 0) {
            return -1;
        }
        
		if (l>=r){
			return array[l]==num?l:-1;
		}	
		int c = (l+r)/2;
		if (num == array[c]) {
			return c;
		}else if (num < array[c]) {
			return binarySearchRecursive(array,num,l,c-1);
			
		}else {			
			return binarySearchRecursive(array,num,c+1,r);
		}
	}
	
    public static int binarySearchRecursive(String[] array, String target, int l, int r) {
        if (array == null || array.length == 0) {
            return -1;
        }
        
        if (l > r) {
            return -1;
        }

        int c = (l + r) / 2; 

        if (array[c].equals(target)) {
            return c;
        }
        else if (target.compareTo(array[c]) < 0) {
            return binarySearchRecursive(array, target, l, c - 1);
        }
        else {
            return binarySearchRecursive(array, target, c + 1, r);
        }
    }
}
