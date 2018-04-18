package wed.funwitharrays;

/**
 *
 * @author john
 */
public class WedFunWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myIntArray = { 0, 1, 2, 3 };
        
        System.out.println(myIntArray[0]);
        
        myIntArray[0] = 5;
        
        System.out.println(myIntArray[0]);
        
        int intToSwap = myIntArray[2];
        
        myIntArray[2] = myIntArray[3];
        
        myIntArray[3] = intToSwap;
        
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[3]);
        
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }
        
        int[] myOtherArray = new int[5];
        
        for (int i = 0; i < myOtherArray.length; i++) {
            myOtherArray[i] = (int)(Math.random() * 100);
        }
        
        System.out.println("-------");
        
        for (int i = 0; i < myOtherArray.length; i++) {
            System.out.println(myOtherArray[i]);
        }
        
        // Write a for loop that prints myOtherArray backwards
        // Write a for loop that sums myOtherArray
        // Write a for loop that prints the largest value
        // Write a for loop that prints the smallest value
        // Write a for loop that finds the average of the array
        // Write a method that takes in an array and an int value and tells you if the int value exists in the array
        // Write a method that swaps the smallest value in the array with the value at the 0 offset (i.e. myOtherArray[0])
        // Write a method that sorts the array
        // Write a method that sorts the arrray in N log N time
    }
    
}
