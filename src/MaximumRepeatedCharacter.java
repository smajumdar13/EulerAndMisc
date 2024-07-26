import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class MaximumRepeatedCharacter {
    public static String maximumRepeatedCharacterOrString(List<String> arr) {
        String res = "";
        int temp = 1;
        int count = 1;
        List<String> strn = arr.stream().sorted().collect(toList());
        // a a a a a b b b c c c c c c c c d d d d d d
        for (int i = 0; i < strn.size(); i++) {
            if (i+1 == strn.size()) {
                if (temp > count) {
                    res = strn.get(i);
                    break;
                } else {
                    break;
                }
            } else if (strn.get(i+1).equals(strn.get(i))) {
                temp++;
            } else {
                if (count < temp) {
                    res = strn.get(i);
                    count = temp;
                }
                temp = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> arr = List.of("a", "a", "a", "a", "a", "b", "b", "b", "c", "c", "c", "c", "c", "c", "c", "c","c", "c", "d", "d", "d", "d", "d", "d");
//        List<String> arr = List.of ("A", "B", "D", "A", "R", "V", "S", "B", "C", "R", "S", "R", "Z", "M", "D");
        System.out.println(maximumRepeatedCharacterOrString(arr));
        usingHashMap(arr);

    }

    public static String usingHashMap(List<String> arr) {
        Map<String, Integer> map = new HashMap<>();
        for (String s: arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int max = 0;
        String maxStr = "";
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxStr = entry.getKey();
            }
        }
        System.out.println("The string is: " + maxStr + " and the count of repitition is: " + max);
        return maxStr;

    }
}
