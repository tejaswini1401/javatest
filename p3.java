import java.util.HashMap;
import java.util.Map;

class WordCount {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        Map<String, Integer> wordCountMap = countWords(str);
        
        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String str) {
        String[] words = str.split("\\s+"); // Split the string into words using whitespace as delimiter
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            // Remove any punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z]", "");
            word = word.toLowerCase(); // Convert the word to lowercase to avoid case sensitivity
            if (!word.isEmpty()) {
                // If the word is not empty after removing punctuation marks
                // Increment the count of the word in the map
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}
