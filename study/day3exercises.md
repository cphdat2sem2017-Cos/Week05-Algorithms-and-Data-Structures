#Day 3 exercises
##Exercise 1 Quicksort 

Execute the animation (http://me.dt.in.th/page/Quicksort/)
several times until you understand the principle behind the algorithm.

Notice that there are some animations further down the page

##Exercise 2 Quicksort implementation

###a)
Implement the quicksort algorithm in Java. Use the pseudo code on WIKIPEDIA as inspiration (http://en.wikipedia.org/wiki/Quicksort).

* Choose the element in the middle as the pivot element. 
* Test with an array of arbitrary integers.


###b) 
Measure actual execution times for the sorting implementation.

* long time = System.nanoTime() returns a value representing the current time
* Perform measurements on several arrays while varying their size.
* Compare with SelectionSort. [Source code in github](SelectionSort.java).

###c)
Produce a worst case for Quicksort by sorting an (already) sorted array and choosing the first element in the array as the pivot element.
How big an impact does it have on the execution time? 

###d)
Let the algorithm choose a ”sensible” pivot element (what is a sensible pivot element?)

Measure execution times for the sort() method in the Arrays class and compare Quicksort for

* unsorted arrays
* sorted arrays

###e)
What algorithm is actually used in the sort() method in the Arrays class?

* Look up the answer in the documentation for API.

The sort() method is heavily overloaded. Make a small check for whether the library uses the same algorithm in

*	sort(int[])   
*	sort(Object[]) 

##Exercise 3

See the Merge Sort - animation on <http://visualgo.net/sorting> several times until you understand the principle behind the algorithm. There are also some animations on <https://en.wikipedia.org/wiki/Merge_sort>.



##Exercise 4.

###a)
Implement the MergeSort algorithm in Java from the pseudo code on wikipedia   (<http://en.wikipedia.org/wiki/Merge_sort>)

Personally I like the list based solution (the last one listed in wikipedia) better than the one named top-down and bottom-up.







