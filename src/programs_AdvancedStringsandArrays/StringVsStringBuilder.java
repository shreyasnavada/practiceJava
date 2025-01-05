package programs_AdvancedStringsandArrays;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        // Demonstrating immutability of String
        String immutableString = "Hello";
        System.out.println("Original String: " + immutableString);

        // Attempt to modify the String
        String modifiedString = immutableString.concat(" World");

        // Observe that the original String is unchanged
        System.out.println("After concatenation attempt: " + immutableString);
        System.out.println("New String after concatenation: " + modifiedString);

        // Demonstrating mutability of StringBuilder
        StringBuilder mutableStringBuilder = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + mutableStringBuilder);

        // Modify the StringBuilder by appending text
        mutableStringBuilder.append(" World");

        // Observe that the original StringBuilder is modified
        System.out.println("After appending: " + mutableStringBuilder);
    }
}

//Explanation:
//
//    Immutability of String:
//        String objects are immutable, meaning any modification (like concatenation) 
//        creates a new String object without altering the original one.
//        In the example, immutableString.concat(" World") does not change immutableString. 
//        Instead, it creates a new String (modifiedString).
//
//    Mutability of StringBuilder:
//        StringBuilder objects are mutable, so methods like append modify the same instance.
//        In the example, mutableStringBuilder.append(" World") directly 
//        changes the content of mutableStringBuilder.
//
//Why String is Immutable
//
//In Java, the String class is designed to be immutable for several important reasons:
//
//    Security:
//        Strings are frequently used for sensitive data like usernames, passwords, and connection URLs. Immutability ensures that once a String object is created, its value cannot be changed, preventing accidental or malicious modifications.
//
//    String Pooling:
//        Java uses a string constant pool to optimize memory usage. If strings were mutable, it would be unsafe to share references to string objects. By making String immutable, Java can safely reuse string literals from the pool.
//
//    Hashcode Caching:
//        Strings are often used as keys in hash-based collections like HashMap. Since String is immutable, its hashcode can be cached after it's calculated the first time. This improves performance for repeated lookups.
//
//    Ease of Use in Multithreading:
//        Since String is immutable, multiple threads can safely share the same String instance without synchronization. This makes String inherently thread-safe, simplifying concurrent programming.
//
//Why String is Thread-Safe
//
//    No Synchronization Needed:
//        Immutability guarantees that once a String object is created, its state cannot change. Therefore, there’s no need to synchronize access to String objects in multithreaded environments.
//
//    Consistent State:
//        A String object remains consistent across all threads because its value cannot be altered after creation.
