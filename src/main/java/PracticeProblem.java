import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	
	public static int[] compareSearch(int[] arr, int number){
		Arrays.sort(arr);
		int[] count = new int[] {0, 0};
		int counterSeq = 0;
		int counterBin = 0;
			for (int s = 0; s < arr.length; s++){
				counterSeq++;
				if (number == arr[s]){
					break;
			}
		}
			int low =0;
			int high = arr.length-1;
			int mid;
				while (low <= high){
				mid = (low + high) / 2;
				counterBin++;
			if (number == arr[mid]){
			low = high+1;
		} else if (number > arr[mid]) {
			low = mid + 1;
		} else {
			high = mid-1;
		}
	}
	count[0] = counterSeq;
	count[1] = counterBin;
	return count;
	}

	public static int[] compareStringSearch(String[] arr, String str){
		Arrays.sort(arr);
		int[] count = new int[] {0, 0};
		int counterSeq = 0;
		int counterBin = 0;
		for (int s = 0; s<arr.length; s++){
		counterSeq++;
		if (str == arr[s]){
			s = arr.length;
		}
		}
		int low =0;
		int high = arr.length-1;
		int mid;
		while (low<=high){
			mid = (low+high)/2;
			counterBin++;
			if (str == arr[mid]){
				low = high+1;
			}
			else if (str.compareTo(arr[mid])>0){
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}
		
		count[0] = counterSeq;
		count[1] = counterBin;
		return count;
		}
	}

