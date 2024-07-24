package Sample;

public class DuplicateCharacters {
    
    public static void main(String[] args) {
        String str = "programming";
        
        System.out.println("Duplicate characters in the string '" + str + "':");
        printDuplicateCharacters(str);
    }
    
    // Method to print duplicate characters in a string
    public static void printDuplicateCharacters(String str) {
        // Assuming ASCII characters (0-255), create an array to count occurrences
        int[] charCount = new int[256]; // Using 256 to cover extended ASCII
        
        // Count occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        
        // Print characters with count > 1
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i] + " times");
            }
        }
    }
}