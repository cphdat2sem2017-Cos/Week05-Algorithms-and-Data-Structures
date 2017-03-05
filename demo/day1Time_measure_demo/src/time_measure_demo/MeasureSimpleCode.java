package time_measure_demo;



import java.util.*;

// Demo: Measure execution time for a piece of code
// Insert code where indicated
// 
// hau

public class MeasureSimpleCode {

	public static void main(String[] args) 
	{	
                
                long n = 10000;  // "problem size - initial value = 10000"
		
                long startTime = System.nanoTime();
                
                //---- measure start ---------------                
                for (long i = 0; i < n; i++)
                {
                    Math.sqrt(i); // initial
                    
                }                
                //---- measure end -----------------  
                
                long executionTime = System.nanoTime() - startTime;	
                //-- present result
                System.out.println("Time elapsed (micro sec): " + executionTime/1000);
	
					
	}
	
	//-- Sleeps for 1 ms
        //   may be called to slow execution down
	private static void delay()
	{
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
        
        


  	
	

}
