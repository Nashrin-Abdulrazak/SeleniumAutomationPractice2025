
public class FindMaxandOccurrences {

	public static void main(String[] args) {

		int[] arr = {1, 3, 5, 3, 5, 5, 2, 5, 4};
        
        int max = arr[0];
        int count = 1;

        // Find maximum and count occurrences
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
               // count = 1;
            } else if (arr[i] == max) {
                count++;
            }
        }

        // Print result
        System.out.println("Maximum number: " + max);
        System.out.println("Occurrences: " + count);
		
		
		
	}

}
