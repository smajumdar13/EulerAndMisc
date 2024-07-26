public class SnakeToCamelCase {

    public static String snakeToCamel(String str) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == '_' && arr[i - 1] != ' ') {
                continue;
            }
            if (i > 2 && arr[i-1] == '_' && (arr[i-2] >= 'a' && arr[i-2] <= 'z')) {
                sb.append(Character.toUpperCase(arr[i]));
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(snakeToCamel("__hello _world_view"));
        System.out.println(snakeToCamel("This is the doc_string for __secret_fun"));
    }
}
