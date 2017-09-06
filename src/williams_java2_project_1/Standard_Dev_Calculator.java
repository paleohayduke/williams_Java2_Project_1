/*
    Walter Williams
    Standard_Dev_Calculator
    9/5/2017
    This Class can return the mean and standard deviation of a list of numbers.
    Numbers are added with the add_num method and calc_mean and calc_standard_dev
    return the mean and standard deviation of the number list.
*/
package williams_java2_project_1;

import java.util.ArrayList;

/**
 *
 * @author PALEOHAYDUKE
 */
public class Standard_Dev_Calculator {
    
    // This is the arraylist that holds the list of numbers
    private ArrayList<Double> numbers = new ArrayList();
    
    //not needed, can just use default constructor
    public Standard_Dev_Calculator(){
    }
    
    // add_num
    // Walter Williams
    // 9-5-2017
    // adds number to array list
    // arguments: double
    // returns: void
    public void add_num(double number){
        numbers.add(number);
    }
    
    
    //calc_mean
    // Walter Williams
    // 9-5-2017
    // This calculates and returns mean
    // arguments: <none>
    // returns: double 
    public double calc_mean(){
        double sum=0;
        for(int count = 0;count<numbers.size();count++){
            sum+=numbers.get(count);
        }
        return sum/numbers.size();
    }
    
    //calc_std_dev
    // Walter Williams
    // 9-5-2017
    // This calculates and returns standard deviation
    // arguments: <none>
    // returns: double 

    public double calc_std_dev(){
        double sum = 0;
        for(int count = 0;count<numbers.size();count++){
            sum+=Math.pow(numbers.get(count)-calc_mean(),2);
        }
        
        return Math.sqrt(sum/numbers.size());
    }
    
    // show_numbers
    // Walter Williams
    // 9-5-2017
    // Shows numbers, for debug use (not used)
    // arguments: <none>
    // returns: String     
    public String show_numbers(){
        return numbers.toString();
    }
    
    
    
}
