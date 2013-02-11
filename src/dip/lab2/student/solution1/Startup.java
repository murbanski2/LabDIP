package dip.lab2.student.solution1;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author Mark Urbanski
 */
public class Startup {
//    public static enum ServiceQuality {
//           GOOD, FAIR, POOR
//    };
    //I put the enum in its own file so that a single copy would be used
    //by all classes, including my interface class.
 
    public static void main(String[] args) {

        //Using the new interface and changed FoodServiceTipCalculator
        ServiceTipCalculator service1 = 
                new FoodServiceTipCalculator(ServiceQuality.GOOD,40.00);
        System.out.println("Output for my Food Service tip with good service for $40.");
        System.out.println(service1.getTip());
        
        //Using the new interface and changed FoodServiceTipCalculator
        ServiceTipCalculator service2 = 
                new BaggageServiceTipCalculator(ServiceQuality.GOOD,5);
        System.out.println("Output for my Baggage Service tip with good service for 5 bags.");
        System.out.println(service2.getTip());
        
        //The main method here depends on the interface, not the lower-level
        //classes.  getTip works for each, even though the calculations are
        //different.
        
        //What I don't like is that the constructors are different
        //for each one.  I feel like I want to control the constructors,
        //but I can't seem to control those with an interface.  I looked at
        //trying to control things using my getTip function by passing 
        //parameters, but that seemed unsatisfying too.
        
        //I am also not sure if it makes sense to trim the extra functions
        //out of the lower-level classes.  They are not "needed" but there
        //is no reason that I, as the interface guy, would take out code
        //from another person's functions.  Changing those might break 
        //something somewhere else.
    }

}
