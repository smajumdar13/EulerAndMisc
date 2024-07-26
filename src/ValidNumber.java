/*
Given a string s, return whether s is a valid number.
For example, all the following are valid numbers: "2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789", while the following are not valid numbers: "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53".

Formally, a valid number is defined using one of the following definitions:
An integer number followed by an optional exponent.
A decimal number followed by an optional exponent.
An integer number is defined with an optional sign '-' or '+' followed by digits.
A decimal number is defined with an optional sign '-' or '+' followed by one of the following definitions:

Digits followed by a dot '.'.
Digits followed by a dot '.' followed by digits.
A dot '.' followed by digits.
An exponent is defined with an exponent notation 'e' or 'E' followed by an integer number.
The digits are defined as one or more digits.
 */
public class ValidNumber {
    public static boolean isNumber(String s) {
        char[] arr = s.toCharArray();
        int dotPos = -1;
        int ePos = -1;
        int optPos = -1;
        if (arr.length == 1 && !Character.toString(arr[0]).matches("[-+0-9.]")) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (Character.toString(arr[i]).matches("[A-DF-Za-df-z]")) {
                return false;
            }
            if (arr[i] == '.') {
                dotPos = i;
            }
            if (dotPos + 1 == arr.length || !Character.toString(arr[dotPos+1]).matches("[0-9]")) {
                return false;
            }
            if (arr[i] == 'e' || arr[i] == 'E') {
                ePos = i;
            }
            if (i > 0 && arr[i] == '-') {
                optPos = i;
            }
            if (i > 0 && arr[i] == '+') {
                return false;
            }
        }
        if (ePos == 0 || dotPos == 0) {
            return false;
        }
        if (dotPos > ePos) {
            return false;
        }
        if (ePos > optPos) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumber(".1"));
    }
}
