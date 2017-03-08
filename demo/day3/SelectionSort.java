
public class SelectionSort {


	
	 public static void selectionSort (int[] list)
	   {
	      int min;
	      int temp;

	      for (int index = 0; index < list.length-1; index++)
	      {
	         min = index;
	         for (int scan = index+1; scan < list.length; scan++)
	            if (list[scan] < list[min])
	               min = scan;

	         // Swap the values
	         temp = list[min];
	         list[min] = list[index];
	         list[index] = temp;
	      }
	   }


}
