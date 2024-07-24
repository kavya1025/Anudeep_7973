package Sample;

public class StringTransformation {
    
    public static void main(String[] args) {
        String originalString = "OpenAI is amazing";
        
        String transformedString = transformString(originalString);
        
        System.out.println("Original string: " + originalString);
        System.out.println("Transformed string: " + transformedString);
    }
    
    // Method to transform the string
    public static String transformString(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        
        // Create StringBuilder to construct the transformed string
        StringBuilder sb = new StringBuilder();
        
        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" "); // Add space between words except after the last word
            }
        }
        
        return sb.toString();
    }
}