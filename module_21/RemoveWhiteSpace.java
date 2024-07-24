package Sample;

public class RemoveWhiteSpace {
    
    public static void main(String[] args) {
        String str = "  Hello  Java  ";
        String trimmedString = removeWhiteSpace(str);
        
        System.out.println("Original String: '" + str + "'");
        System.out.println("String without white spaces: '" + trimmedString + "'");
    }
    
    // Method to remove all white spaces from a string
    public static String removeWhiteSpace(String str) {
        // Using regular expression to replace all white spaces with empty string
        return str.replaceAll("\\s","") ;
    }
}