package time_measure_demo;

import java.util.List;

/**
 *
 * @author hau
 */
public class MeasureAlgorithm
{

    public static void main(String[] args)
    {
        int n = 100000;             // problem size
        int target = n-1;           // search target
        int[] list = new int[n];
        // fill list
        for (int i = 0; i < list.length; i++)
        {
            list[i] = i;
        }
        

        
        long startTime = System.nanoTime();
        //---- code to measure start ---------------        
        int result = Searching.linearSearch(list, target);
        //---- code to measure end -----------------           
        long executionTime = System.nanoTime() - startTime;

        //-- present result
        System.out.println("Time elapsed (micro sec): " + executionTime/1000);
        System.out.println("Value:" + result);
    }

}
