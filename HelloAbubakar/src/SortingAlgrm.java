
public class SortingAlgrm {
	
	//Array elements to sort
	int my_list[] = {5, 7, 4, 73, 56, 89, 34, 3};
	
	
	//Selection sort algorithm
	
	public int[] selectSort() {
		
		for(int m = 0; m < my_list.length; m++) {
			int index = m;
			for(int i= m; i < my_list.length; i++) {
				if(my_list[i] < my_list[index]) {
					index = i;
					int smallNumber = my_list[index];
					my_list[index] = my_list[m];
					my_list[m] = smallNumber;
				}
				
			}
			
		}
		
		return my_list;
	}
	
	//End of selection sort algorithm
	
	//Insertion sort algorithm
	
	public int[] insertionSort() {
		int temp;
		for(int i=0; i<my_list.length; i++) {
			for(int j=i; j>0; j--) {
				if(my_list[j]<my_list[j-1]) {
					temp = my_list[j];
					my_list[j] = my_list[j-1];
					my_list[j-1] = temp;
				}
			}
		}
		return my_list;
	}
	
	//End of insertion sort algorithm
	
	//Bubble sort algorithm
	
	public static void bubbleSort(int myArray[]) {
		int n = myArray.length;
		int k;
		for(int m=n; m>=0; m--) {
			for(int i=0;i<n-1;i++) {
				k = i + 1;
				if(myArray[i] > myArray[k]) {
					swapNumber(i, k , myArray);
				}
			}
			
			printNumber(myArray);
		}
	}
	
	private static void swapNumber(int i, int j, int[] num) {
		int temp;
		
		temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
	
	private static void printNumber(int[] myArray) {
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i]+", ");
		}
		System.out.println("\n");
	}
	
	//End of bubble sort algorithm
	
	//Merge sort algorithm
	
	
}
