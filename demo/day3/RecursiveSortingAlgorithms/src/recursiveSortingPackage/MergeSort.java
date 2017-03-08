package recursiveSortingPackage;
// implementation of pseudocode on 
// http://en.wikipedia.org/wiki/Merge_sort
// "Top-down implementation using lists"
// hau

public class MergeSort
{

    public static void merge_sort_start(int[] arr)
    {

        int[] result = merge_sort(arr);

        for (int i = 0; i < result.length; i++)
        {
            arr[i] = result[i];
        }

    }

    // recursive: Divide in two sublists, sort each list, merge the lists
    private static int[] merge_sort(int[] m)
    {
        // if list size is 1, consider it sorted and return it
        if (m.length <= 1)
        {
            return m;
        } // else list size is > 1, so split the list into two sublists
        else
        {
            int[] left = new int[m.length / 2];
            int[] right = new int[m.length - m.length / 2];
            int middle = m.length / 2;
            // for each x in m before middle add x to left		
            for (int i = 0; i < middle; i++)
            {
                left[i] = m[i];
            }
            // for each x in m after or equal middle add x to right 
            for (int j = middle; j < m.length; j++)
            {
                right[j - middle] = m[j];
            }

			// recursively call merge_sort() to further split each sublist
            // until sublist size is 1
            left = merge_sort(left);
            right = merge_sort(right);

			// merge the sublists returned from prior calls to merge_sort()
            // and return the resulting merged sublist
            int[] mergedArray = merge(left, right);

            return mergedArray;

        }
    }
    // merge left and right sub lists
    private static int[] merge(int[] left, int[] right)
    {

        int[] result = new int[left.length + right.length];

        // init pointers 
        int posLeft = 0;
        int posRight = 0;
        int posRes = 0;

        // merge from both lists
        while (posLeft < left.length && posRight < right.length)
        {
            if (left[posLeft] <= right[posRight])
            {
                result[posRes] = left[posLeft];
                posLeft++;            
            } else
            {
                result[posRes] = right[posRight];
                posRight++;
            }
            posRes++;
        }
        // append rest from left list
        while (posLeft < left.length)
        {
            result[posRes] = left[posLeft];
            posLeft++; 
            posRes++;
        }
        // append rest from right list
        while (posRight < right.length)
        {
            result[posRes] = right[posRight];
            posRight++; 
            posRes++;
        }            

        return result;
    }
}
