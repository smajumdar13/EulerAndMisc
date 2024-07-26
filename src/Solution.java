import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class Solution {
     static List<Character> commonChars(String[] words) {
         Map<Character, Integer> ch1 = new TreeMap();
         for (char c : words[0].toCharArray()) {
             ch1.put(c, ch1.getOrDefault(c, 0) + 1);
         }
         for (int i = 1; i < words.length; i++) {
            commonChars(words[i], ch1);
         }

        return ch1.entrySet().stream().map(e -> e.getKey()).collect(toList());
    }

    private static Map<Character, Integer> commonChars(String word, Map<Character, Integer> ch1) {
         Map<Character, Integer> ch2 = new TreeMap<>();
         for (char c : word.toCharArray()) {
             ch2.put(c, ch2.getOrDefault(c, 0) + 1);
          }
         ch1.remove(!ch2.containsKey(ch1));
         return ch1;
    }

    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        // expected e, l, l -> common in all three words
        System.out.println(commonChars(words));
    }

}