import java.util.HashMap;
import java.util.Map;

/*
383. Ransom Note
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mag = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (!mag.containsKey(magazine.charAt(i))) {
                mag.put(magazine.charAt((i)), 1);
            } else {
                mag.put(magazine.charAt(i), mag.get(magazine.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (mag.containsKey(ransomNote.charAt(i)) && mag.get(ransomNote.charAt(i)) == 0) {
                return false;
            } else if (mag.containsKey(ransomNote.charAt(i))) {
                mag.put(ransomNote.charAt(i), mag.get(ransomNote.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("hellllo", "hello world"));
    }
}
