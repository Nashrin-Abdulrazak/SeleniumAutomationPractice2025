
public class MoveZeroToEnd {

	public static void main(String[] args) {
		int[] arr = {2, 0, 0, 4, 0, 1};

        int[] result = new int[arr.length];
        int index=0;

        // Copy all non-zero elements to the result array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        // Print the result
        System.out.print("Array after moving zeros: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
	}

}
