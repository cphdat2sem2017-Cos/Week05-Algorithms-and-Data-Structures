package recursiveSortingPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kasper
 */
public class MergeSortCircularArrayLists {
    public static void merge_sort_start( int[] arr ) {

        CircularArrayList result = CircularArrayList.from( arr);
        merge_sort( result );

        for ( int i = 0; i<arr.length; i++ ) {
            arr[ i ] = result.get( i );
        }

    }

    private static void merge_sort( CircularArrayList arr ) {
        if ( arr.size() <= 1 )
            return ;
        CircularArrayList left = new CircularArrayList();
        CircularArrayList right = new CircularArrayList();
        split_list( arr, left, right );
        merge_sort( left );
        merge_sort( right );
        merge_list( left, right, arr );
    }


    private static void split_list( CircularArrayList arr, CircularArrayList left, CircularArrayList right ) {
        boolean toTheLeft = true;
        for ( int index = 0; index < arr.size(); index++ ) {
            if ( toTheLeft )
                left.add( arr.get(index) );
            else
                right.add( arr.get( index ) );
            toTheLeft = !toTheLeft;
        }
    }

    private static void merge_list( CircularArrayList left, CircularArrayList right,  CircularArrayList mergedList) {
        mergedList.clear();
        while ( !left.isEmpty() && !right.isEmpty() ) {
            int elem = left.peek() < right.peek() ? left.poll(  ) : right.poll(  );
            mergedList.add( elem );
        }
        mergedList.addAll( left );
        mergedList.addAll( right );
    }


}
