import java.util.*;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) {
//        SumOfMultiplesOfThreeOrFive sum = new SumOfMultiplesOfThreeOrFive();
//        System.out.println(sum.sumOfMultiplesOfThreeOrFive(1000));

//        EvenFibonacciValuesSum evenFibonacci = new EvenFibonacciValuesSum();
//        System.out.println(evenFibonacci.sumOfEvenFibonacciNumbers());

//        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
//        System.out.println(largestPrimeFactor.largestPrimeFactor(600851475143L));

//        SquareRoot squareRoot = new SquareRoot();
//        System.out.println(squareRoot.squareRoot(16));

//        System.out.println(getSmallestAndLargest("welcometojava", 3));
//        plusMinus(List.of(-4, 3, -9, 0, 4, 1));

//        System.out.println((timeConversion("12:01:01AM")));
//        System.out.println((timeConversion("12:01:01PM")));
//        System.out.println((timeConversion("07:05:35PM")));
//        System.out.println((timeConversion("03:01:01PM")));
//        System.out.println(findMedian(Arrays.asList(2,3,4, 5, 6)));
//        List<Integer> zeros = new ArrayList<>(10);
//        for (int i = 0; i < 10; i++) {
//            zeros.add(0);
//            System.out.print(zeros.get(i) + " ");
//        }

//        int[] b = new int[]{1,0,0,1,0,0,0};
//        System.out.println(canPlaceFlowers(b, 1));

//        int[] n = new int[]{1,4,3,2};
//        System.out.println(peakElement(n, 2));

//        System.out.println(workingCaesarCipher("Trying to create @Caesar cipher!!", 7));
//        System.out.println(reverseVowels("hello"));
//        System.out.println(reverseWords("How is everything looking"));
//        System.out.println(longestRepeatingSubsequence("aabebcdd"));

        List<String> strings = new ArrayList<>(Arrays.asList("welcometojava", "hello", null, null, "system", "great", null));
        List<Integer> newStr = strings.stream()
                .filter(Objects::nonNull)
                .map(String::length)
                .collect(toList());
        System.out.println(newStr);
    }

    public static long valueOfSomething(List<Integer> list, int k) {
        // 7, 4 , 6 , 3 , 2
        List<Integer> temp = new ArrayList<>();
        int count = 1;
        int idx = 0;
        long cumulativeSum = 0;
        int tempVal = 0;
        for (Integer i : list) {
            while (count <= i) {
                temp.add(count);
            }
            count = 1;
        }
        while (idx < temp.size() - k) {
            tempVal += temp.get(idx);
        }
        return 0;
    }

    public static int longestRepeatingSubsequence(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                res++;
            } else {
                charMap.put(s.charAt(i), 1);
            }
        }
        return res;
    }

    public static String reverseWords(String s) {
        List<String> arr = Arrays.stream(s.split("\\s")).toList();
        StringBuilder sb = new StringBuilder();
        for (int i = arr.size() - 1; i > 0; i--) {
            sb.append(arr.get(i) + " ");
        }
        sb.append(arr.get(0));

        return sb.toString();
    }


    public static String reverseVowels(String s) {
        // l e e t c o d e
        char[] a = s.toCharArray();
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
//        alternative - double bracket initialization of Collections - array, set, map and others
//        Set<Character> newSet = new HashSet<>()
//        {
//            {
//                add('a');
//                add('e');
//                add('i');
//                add('o');
//                add('u');
//            }
//        };
        Character temp;
        int i = 0, j = a.length - 1;
        while (i < j) {
            if(set.contains(a[i]) && set.contains(a[j])) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            } else if (!set.contains(a[i])) {
                i++;
            } else if (!set.contains(a[j])) {
                j--;
            }
        }
        return String.valueOf(a);
    }

    int findFrequency1(int Arr[], int X){
        Map<Integer, Integer> expMap = new HashMap<>();
        for (int i : Arr) {
            if (expMap.containsKey(i)) {
                expMap.put(i, expMap.get(i)+1);
            } else {
                expMap.put(i, 1);
            }
        }
        return expMap.get(X);
    }

    public static String workingCaesarCipher(String str, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : str.toCharArray()) {
            if (character != ' ' && character <= 122 && character >= 97 || character <= 97 && character >= 65) {
                char ch = 'a';
                if ((int) character <= 90) {
                    ch = 'A';
                }
                int originalAlphabetPosition = character - ch;
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) (ch + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String reverseWord(String str)
    {
        StringBuilder s = new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            s.append(str.charAt(i));
        }
        return s.toString();
    }

    public static int peakElement(int[] arr,int n)
    {
        int peak = arr[0];
        for (int i : arr) {
            if (i > peak) {
                peak = i;
            }
        }
        if (arr[n-1] == peak) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int nthPrime(int n) {
        int num = 1;
        int count = 0;
        int i;
        while (count < n) {
            num += 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count++;
            }
        }
        return num;
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max = 0;
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            max += 1;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            max += 1;
        }

        for (int i = 0; i < flowerbed.length - 1; i++) {
            if (i == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                max += 1;
                i += 1;
            } else if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i-1] == 0) {
                max += 1;
            } else if (flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0) {
                max += 1;
                i += 1;
            }
        }
        return max >= n;
    }

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        int median = (arr.size() + 1) / 2;

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(List.of(3, 5, 7));
        int n = lists.get(0).get(1);
        System.out.println(n);
        System.out.println(Math.abs(3-4));

        return arr.get(median - 1);
    }

    public static String timeConversion(String s) {
        // Write your code here
        String timeUnit = s.substring(s.length()-2);
        String res = "";
        int hour = Integer.parseInt(s.substring(0, 2));
        if (timeUnit.equals("PM") && hour != 12) {
            res += (hour + 12);
            res += s.substring(2, s.length()-2);
        } else if (timeUnit.equals("AM") && hour == 12) {
            res += ("00");
            res += s.substring(2, s.length()-2);
        } else {
            res += s.substring(0, s.length()-2);
        }

        return res;
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double pos = 0;
        double neg = 0;
        double zero = 0;
        for (Integer i : arr) {
            if (i == 0) {
                zero += 1;
            } else if (i > 0) {
                pos += 1;
            } else {
                neg += 1;
            }
        }
        System.out.printf("%.6f \n", pos/arr.size());
        System.out.printf("%.6f \n", neg/arr.size());
        System.out.printf("%.6f", zero/arr.size());
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int idx = 0;
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        String temp;

        while ((idx + k) <= s.length()) {
            temp = s.substring(idx, idx + k );
            if (temp.compareTo(smallest) < 0) {
                smallest = temp;
            }
            if (temp.compareTo(largest) > 0) {
                largest = temp;
            }
            idx++;
//            k++;
        }

        return smallest + "\n" + largest;
    }
}