import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kristinOlof
 *  Print the numbers from 1 to 5. Pause for 2 seconds between each print.
 */
public class task2 extends Thread
{
    public void run()
    {
        for (int i = 1; i < 6; i++) 
        {
            try 
            { Thread.sleep(2000);} 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(task2.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Thread/Task 2 : From 1 to 6 : " + i);  
        }
    }  
}
