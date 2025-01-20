import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 5;

        System.out.println("Array before sorting : " + Arrays.toString(arr));
        bubble_sort(arr, N);
        System.out.println("Array after sorting : " + Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr, int N) {
        boolean isSorted = true;
        // Take a counter
        for(int i=0; i<N; i++) {
            // Foe every step largest element will appear at last
            for(int j=1; j<N-i; j++) {
                // if adjacent element is small
                if(arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSorted = false;
                }
            }

            if(!isSorted)
                break;
        }
    }
}
