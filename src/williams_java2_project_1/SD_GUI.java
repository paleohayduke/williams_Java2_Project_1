/*
 * Walter Williams
    SD_GUI
    This class creates an object that handles GUI and I/O with user
 */
package williams_java2_project_1;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author PALEOHAYDUKE
 */
public class SD_GUI {
    
    // object used to take numbers and calculate mean and standard deviation
    Standard_Dev_Calculator calculator = new Standard_Dev_Calculator();
    
    // SD_GUI
    // Walter Williams
    // 9-5-2017
    // This method is a constructor for the class and does all the work there
    // is to do for the GUI. It loops until it has collected 10 numbers from the
    // user. If the user fails to enter valid input, an error message will be
    // displayed to inform the user of their error and they will be given
    // the chance to enter in valid input. Count does not increment unless
    // valid data has been entered. 
    public SD_GUI(){
        int count = 0;
        while(count <10){
            String input = JOptionPane.showInputDialog("Number "+(count+1)+": ");
            try{
                calculator.add_num(Integer.parseInt(input));
                count++;
            }
            catch (NumberFormatException err){
                JOptionPane.showMessageDialog(null, "Error: "+err+
                        "\nPlease enter a number.");
            }
            catch (Exception err){
                JOptionPane.showMessageDialog(null, "Unexpected Error");
            }
        }

        JOptionPane.showMessageDialog(null, "Your Numbers: " +
                calculator.show_numbers()+"\nMean: "+calculator.calc_mean()+
                 "\nSTD DEV: "+calculator.calc_std_dev());
        
    }
}
