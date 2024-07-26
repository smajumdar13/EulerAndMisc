import java.util.*;

public class KmpAlgorithm {
    public static void main(String[] args) {
        System.out.println(kmpAlgorithmForPatternSearch("THIS IS A TEST TEXT", "TEST"));
        System.out.println(kmpAlgorithmForPatternSearch("AABAACAADAABAABA", "AABA"));
    }

    public static List<Integer> kmpAlgorithmForPatternSearch(String s, String sub) {
        Map<String, List<Integer>> listMap = new HashMap<>();
        for (int i = 0; i <= s.length()-4; i++) {
            if (listMap.containsKey(s.substring(i, i+4))) {
                listMap.get(s.substring(i, i+4)).add(i);
            } else {
                int finalI = i;
                listMap.put(s.substring(i, i+4), new ArrayList<>() {
                    {
                        add(finalI);
                    }
                });
            }
        }
        return listMap.getOrDefault(sub, Collections.emptyList());
    }
}
