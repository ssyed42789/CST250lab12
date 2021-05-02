
package cst250lab12;




 
import java.util.Scanner;
 

public class CST250lab12 {
    private static  String SOURCE_PEG = "Source";
    private static  String TARGET_PEG = "Target";
    private static  String SPARE_PEG = "Spare";
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of discs:");
        int numberOfDiscs = scanner.nextInt();
        solveTowersOfHanoi(numberOfDiscs, SOURCE_PEG, TARGET_PEG, SPARE_PEG);
        scanner.close();
    }
 

    private static void solveTowersOfHanoi(int numberOfDiscs, String sourcePeg, String targetPeg, String sparePeg) {
        if (numberOfDiscs == 1) {
            System.out.println(sourcePeg + " => " + targetPeg);
        } else {
            solveTowersOfHanoi(numberOfDiscs - 1, sourcePeg, sparePeg, targetPeg);
            System.out.println(sourcePeg + " => " + targetPeg);
            solveTowersOfHanoi(numberOfDiscs - 1, sparePeg, targetPeg, sourcePeg);
        }
 
    }
}
        
    
    

