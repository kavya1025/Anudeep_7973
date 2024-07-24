package Sample;

public class StringBuilderOperations
{
    
    public static void main(String[] args)
    {
        // Initialize StringBuilder with initial value "Hello"
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial state: " + sb.toString());
        
        // Append " World"
        sb.append(" World");
        System.out.println("After append(\" World\"): " + sb.toString());
        
        // Insert comma at index 5
        sb.insert(5, ",");
        System.out.println("After insert(5, \",\"): " + sb.toString());
        
        // Replace " World" with " Java" starting from index 6 to index 12
        sb.replace(6, 12, " Java");
        System.out.println("After replace(6, 12, \" Java\"): " + sb.toString());
        
        // Delete character at index 5 (which is the space)
        sb.delete(5, 6);
        System.out.println("After delete(5, 6): " + sb.toString());
        
        // Reverse the StringBuilder
        sb.reverse();
        System.out.println("After reverse(): " + sb.toString());
    }
}