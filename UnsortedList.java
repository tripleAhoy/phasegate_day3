import java.util.Arrays;
public class UnsortedList{

	public static int[] sortedInDescending(int[] array) {
		
		for(int index = 0; index < array.length; index++) {
			int currentMax = array[index];
			int currentMaxIndex = index;
			
		for(int count = index + 1; count < array.length; count++) {
			if(currentMax < array[count]) {
				currentMax = array[count];
				currentMaxIndex = count;
			}
		}

		if(currentMaxIndex != index) {
			array[currentMaxIndex] = array[index];
			array[index] = currentMax;
			}
		}


		return array;
	}		
	
	public static void main(String[] args) {
		int[] array = {3,1,5,8,6,4};
		

		System.out.print(Arrays.toString(sortedInDescending(array)));
	}
}


