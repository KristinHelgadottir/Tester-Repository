import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kristinOlof
 */

public class controller 
{
    public static void main(String[] args) 
    {
          task1 t1 = new task1();
          t1.start();
          
          task3 t3 = new task3();
          t3.start();
          
          task2 t2 = new task2();
          t2.start();
          
         
           boolean poul = false;
        try 
        {
            Thread.sleep(10000);
           
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
