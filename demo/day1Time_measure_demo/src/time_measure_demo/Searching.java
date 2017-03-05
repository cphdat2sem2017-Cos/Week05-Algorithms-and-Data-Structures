package time_measure_demo;

//********************************************************************
//  Searching.java       Author: Lewis/Loftus
//
//  Demonstrates the linear search and binary search algorithms.
//  
//  Changed from Comparable to int /hau
//********************************************************************

public class Searching
{
   //-----------------------------------------------------------------
   //  Searches the specified array of objects for the target using
   //  a linear search. Returns a reference to the target object from
   //  the array if found, and null otherwise.
   //-----------------------------------------------------------------
   public static int linearSearch (int[] list,
                                   int target)
   {
      int index = 0;
      boolean found = false;

      while (!found && index < list.length)
      {
         if (list[index] == target)
            found = true;
         else
            index++;
      }

      if (found)
         return list[index];
      else
         return Integer.MAX_VALUE;
   }

   //-----------------------------------------------------------------
   //  Searches the specified array of objects for the target using
   //  a binary search. Assumes the array is already sorted in
   //  ascending order when it is passed in. Returns a reference to
   //  the target object from the array if found, and null otherwise.
   //-----------------------------------------------------------------
   public static int binarySearch (int[] list, 
                                   int target)
   {
      int min=0, max=list.length-1, mid=0;
      boolean found = false;

      while (!found && min <= max)
      {
         mid = (min+max) / 2;
         if (list[mid] == target)
            found = true;
         else
            if (target < list[mid])
               max = mid-1;
            else
               min = mid+1;
      }

      if (found)
         return list[mid];
      else
         return Integer.MAX_VALUE;
   }
}
