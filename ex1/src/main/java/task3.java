import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kristinOlof
 *  Print all numbers from 10 and up. Pause for 3 seconds between each print.
 */
public class task3 extends Thread
{
    public boolean poul = true;
    
    public void run()
    {
        for (int i = 10 ; poul ; i++) 
        {
            System.out.println("Thread/Task 3 : While Poul is True print Numbers : " + i);
            try 
            { Thread.sleep(3000);} 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(task3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }  
}
