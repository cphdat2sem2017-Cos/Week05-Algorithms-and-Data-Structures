
package recursiveSortingPackage;

public class HeapSort {
    public static void heapsort( int[] arr, int n ) {
        for ( int m = n / 2; m >= 0; m-- )
            heapify( arr, m, n - 1 );
        for ( int m = n - 1; m >= 1; m-- ) {
            swap( arr, 0, m );
            heapify( arr, 0, m - 1 );
        }
    }

    private static void heapify( int[] arr, int i, int k ) // heapify node arr[i] in the tree arr[0..k]
    {
        int j = 2 * i + 1;
        if ( j <= k ) {
            if ( j + 1 <= k && arr[ j ] < arr[ j + 1 ] )
                j++;
            if ( arr[ i ] < arr[ j ] ) {
                swap( arr, i, j );
                heapify( arr, j, k );
            }
        }
    }


    private static void swap( int[] arr, int s, int t ) {
        int tmp = arr[ s ];
        arr[ s ] = arr[ t ];
        arr[ t ] = tmp;
    }
}
