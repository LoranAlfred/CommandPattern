package objects;

/**
 * This class represents the main class to run the command pattern example.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Client {

    /**
     * Main method.
     *
     * @param args The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] args ) {
        TextFileOperationExecutor textFileOperationExecutor
                        = new TextFileOperationExecutor ();
        System.out.println ( textFileOperationExecutor.executeOperation ( () -> "Opening file file1.txt" ) );
        System.out.println ( textFileOperationExecutor.executeOperation ( () -> "Saving file file1.txt" ) );
    }
}
