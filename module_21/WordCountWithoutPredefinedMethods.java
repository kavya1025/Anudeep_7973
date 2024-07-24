package Sample;

public class WordCountWithoutPredefinedMethods {
    
    public static void main(String[] args) {
        String str = "Hello Kavitha Mam?";
        int wordCount = countWords(str);
        
        System.out.println("Number of words in the string: " + wordCount);
    }
    
    // Method to count words in a string without using predefined methods
    public static int countWords(String str) {
        int wordCount = 0;
        boolean inWord = false;
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // Check if current character is a whitespace
            if (c == ' ' || c == '\t' || c == '\n' || c == '\r' || c == '\f') {
                inWord = false; // Set flag indicating end of a word
            } else {
                // If not a whitespace and not already in a word, count it as a new word
                if (!inWord) {
                    wordCount++;
                    inWord = true; // Set flag indicating start of a word
                }
            }
        }
        
        return wordCount;
    }
}