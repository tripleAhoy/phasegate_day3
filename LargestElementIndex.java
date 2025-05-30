import java.util.Arrays;
public class LargestElementIndex{

	public static int indexOfLargest(int[] array){
		int largest = array[0];
		int counter = 0;
		for(int index = 0; index < array.length; index++) {

			if(array[index] > largest) {
				largest = array[index];
				counter = index;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		int[] array = {1,2,8,20,5};

		System.out.print(indexOfLargest(array));
	}
}
