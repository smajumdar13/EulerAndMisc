public class SnakeCaseToCamelCase {
    public String snakeCaseToCamelCase(String str) {
        StringBuilder res = new StringBuilder();
        // __This _is A __test_thing__ -> this is a testThing
        if (str.isEmpty() || str.isBlank()) {
            return str;
        }
        if (str.length() == 1 && str.charAt(0) != '_') {
            return String.valueOf(Character.toLowerCase(str.charAt(0)));
        }
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z' || arr[i] >= 'a' && arr[i] <= 'z') {
                if (res.isEmpty() && arr[i] != '_') {
                    res.append(Character.toLowerCase(arr[i]));
                } else if (res.charAt(res.length() - 1) == ' ') {
                    res.append(Character.toLowerCase(arr[i]));
                } else if (res.charAt(res.length() - 1) != ' ' && arr[i-1] == '_' && (arr[i-2] != '_' || arr[i-2] != ' ')) {
                    res.append(Character.toUpperCase(arr[i]));
                } else {
                    res.append(Character.toLowerCase(arr[i]));
                }
            } else if (arr[i] != '_') {
                res.append(arr[i]);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        SnakeCaseToCamelCase caseChange = new SnakeCaseToCamelCase();
//        System.out.println(caseChange.snakeCaseToCamelCase("__this _is a __test_thing__"));
//        System.out.println(caseChange.snakeCaseToCamelCase("__tHIS _is A __test_THING __HOwever _it_might _____be___wrong"));
        System.out.println(caseChange.snakeCaseToCamelCase("Hello__ __this__is_AGAIN_ANOthER_____ file_name____property ___________TEST __@_"));
    }
}
