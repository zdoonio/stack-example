package org.example;

import java.util.Stack;

/*
    In English and programming, groups can be made using symbols such as () and {} that change meaning. However, these groups must be closed in the correct order to maintain correct syntax.
    Your job will be to make a program that checks a string for correct grouping. For instance, the following groups are done correctly:
    ({})
    [[]()]
    [{()}]
    []([])
    The next are done incorrectly:
    {(})
    ([]
    [])

    A correct string cannot close groups in the wrong order, open a group but fail to close it, or close a group before it is opened.

    Your function will take an input string that may contain any of the symbols (), {} or [] to create groups.

    It should return True if the string is empty or otherwise grouped correctly, or False if it is grouped incorrectly.
 */
public class Groups {

    public static boolean groupCheck(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if ((c == ')' && last != '(') || (c == ']' && last != '[') || (c == '}' && last != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}