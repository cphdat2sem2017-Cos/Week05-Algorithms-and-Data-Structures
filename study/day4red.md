#Red team exercises
Day 4 is intended as a recapitulation day where we will once again look at the big-O notation and some recursion.
Some of you have grasped this completely already. These exercises are intended to be more challenging.

##Recursion & complexity
###Fibonacci implementation
Consider these two implementations of the fibonacci numbers:

```java
long fibonacci(long n) {
  if ( n == 0 ) return 0;
  if ( n == 1 ) return 1;
  return fibonacci(n-1) + fibonacci(n-2);
}
```

and

```java
public int fibonacci(int n) {
  if ( n == 0 ) return 0;
  if ( n == 1 ) return 1;
  int fib = 1; int prevFib = 1;
  for (int i = 2; i < n; i++){
    fib = fib + prevFib;
    prevFib = fib-prevFib;
  }
  return fib;
}
```

what is the growth rate for each of these implementations as a function of n?

###A few codingbats
Solve and find the complexity for three of the exercises in [Recursion-2 of Codingbat](http://codingbat.com/java/Recursion-2).

###Classic chess-queens problem
The Queen problem is: "In how many ways can one place eight queens on a chess board so none can capture each other in the next move". The question can be generalized to a board of size N.

Write a method which takes board size N as input, and returns the number of solutions for that size board.

How many solutions exist for each board sizes up to 8?

What is the growth rate of the queens problem?

###Heap sort
Heap sort is an interesting sorting algorithm, as it is always _O_(n·log<sub>2</sub>(n)), and it sorts without using only the array itself, that is it does not need to copy elements back and forth like merge sort.
###a)
Figure out what the two phases of a heap sort are? It is necessary to understand how a heap work before trying to implement it. Find an animation which explains it. Write the algorithm in pseudo code.

###b)
Implement the heapsort algorithm. As always, use a helper method for swapping. 

###c) 
Why is this algorithm _O_(n·log<sub>2</sub>(n))?