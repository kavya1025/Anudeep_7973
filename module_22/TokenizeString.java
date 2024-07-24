package Sample;

import java.util.StringTokenizer;

public class TokenizeString {
    
    public static void main(String[] args) {
        String input = "Java,Python,C++,JavaScript";
        
        // Create StringTokenizer with comma as delimiter
        StringTokenizer tokenizer = new StringTokenizer(input, ",");
        
        // Iterate through tokens
        System.out.println("Tokens:");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}