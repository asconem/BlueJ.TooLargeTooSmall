
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (Matthew Ascone)
 * @version (2/5/20)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;
    private Integer g;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }

    public Integer guess(Integer g) {
      Integer result = 0;

        if (chosenNum < g) {
          result = 1;
        } else if (chosenNum > g){
          result = -1;
        } else {
          result = 0;
        }
        return result;
    }
}
