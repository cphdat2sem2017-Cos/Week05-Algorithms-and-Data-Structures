/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiveSortingPackage;

/**
 *
 * @author kasper
 */
public class QuickSortInClass {

    public void quicksort(int[] A, int lo, int hi) {
        if (lo < hi) {
            int p = partition(A, lo, hi);
            quicksort(A, lo, p - 1);
            quicksort(A, p + 1, hi);
        }
    }

    private int partition(int[] A, int lo, int hi) {
        int pivot = A[hi];
        int i = lo;  
        for (int j = lo ; j<= hi - 1; j++) {
            if (A[j] <= pivot) {
                swap( A, i,j);
                i = i + 1;
            }
        }
        //swap A[i] with A[hi]
        swap( A, i, hi);
        return i;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
