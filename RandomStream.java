import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * An implementation of a solution to the problem of sampling random inputs from a
 * stream of unknown length.
 *
 * @author Sophie von Coelln
 */
public class RandomStream {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(randomLine());

    }

    /**
     * Helper method to get the next line of a stream. Remember that once you advance
     * to the next line of the stream, you cannot return to a previous line!
     *
     * @return the next line of the input stream from StdIn. An empty string "" is
     * returned if the end of the input is reached.
     */
    public static String next(Scanner scan) {
        if (scan.hasNext())
            return scan.next();
        return "";
    }

    /**
     * Helper method to generate a uniformly random number in the interval (0,1).
     *
     * @return a random double between 0 and 1 (exclusive).
     */
    public static double random() {

        return Math.random();
    }

    /**
     * Chooses a line from an input stream uniformly at random.
     * @return uniformly random line from StdIn.
     */
    public static String randomLine() throws FileNotFoundException {
        File list = new File ("SampleList.txt");
        Scanner scan = new Scanner(list);
        String temp = "";
        double rand = random()*10;

        for (int i = 0; i <= rand-1; i++)
        {
            temp = next(scan);
        }
        return temp;
    }
}