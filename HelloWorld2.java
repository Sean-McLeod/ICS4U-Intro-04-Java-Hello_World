/**
* The Hello World! program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  Sean McLeod
* @version 1.0
* @since   2020-01-01
*/
final class HelloWorld2 {
    private HelloWorld2() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * This method prints out "Hello, World!".
    * @param args
    */
    public static void main(final String[] args) {
        System.out.println("Hello, World!");
    }
}
