/**
 * Compute and print the sum of all numbers from 1 to 1 billion 
 * For the sum in task-one, use the a long data type
 * 
 */
public class task1 extends Thread
{
    @Override
    public void run()
    {
        long sum = 0; 
        for (long i = 0; i < 1_000_000_000; i++)
        {
          sum = sum + i;
        }
        System.out.println("Thread/Task 1 : Summen er lig med : " + sum);
    }
 
}
