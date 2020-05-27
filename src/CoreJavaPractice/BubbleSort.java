package CoreJavaPractice;
import java.util.HashSet;

public class BubbleSort{
	
	void bubbleSort(int[] array) {	
		int n = array.length; 	
		for(int i=0; i < n-1; i++) {
			for(int j=0; j< n-i-1; j++) {
				if(array[j] > array[j+1]) {
					int holder = array[j];
					array[j] = array[j+1];
					array[j+1]= holder;
				}
			}
		}
	}
	void printArray(int[] array) {
		int n = array.length;
		for(int i=0; i <n ; i++) {
			System.out.println(array[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		BubbleSort blob = new BubbleSort();
		int[] array = {6,2,9,7,3,3};
		blob.bubbleSort(array);
		blob.printArray(array);
		
	}
}