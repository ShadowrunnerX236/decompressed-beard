package Assertions;

/**
 * Main class of the Java program. 
 * 
 * @author UC3M MOOC Team
 * @since 2016-04
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        // we print a heading and make it bigger using HTML formatting
        System.out.println("<h4>-- Minimun Element Finder --</h4>");
        
        // create the finder and call the function to find the minimum element
        Finder myFinder = new Finder();
        int[] myArray = new int[] {25, 42, 3, 12, 7};
        int[] yourArray = new int [] {};
        int min = myFinder.findMinimumElement(myArray);
        
        System.out.println("The minimum element is: " + min);
    }
}
