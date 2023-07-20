package hard;

import java.util.Stack;

public class BracketLogic {

    public static boolean bracketLogic(String xp) {
        String brackets = xp.replaceAll("[^()<>\\[\\]\\{\\}]", "");
        Stack<Character> holder = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            char current = brackets.charAt(i);
            if (current == '[' || current == '{' || current == '(' || current == '<') {
                holder.push(current);
            }
            if (current == ']' || current == '}' || current == ')' || current == '>') {
                if (holder.isEmpty())
                    return false;
                char last = holder.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '['
                        || current == '>' && last == '<')
                    holder.pop();
                else
                    return false;
            }

        }

        return holder.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
//        System.out.println(bracketLogic("[(a*b+<7-c>+9]"));
        System.out.println(bracketLogic("[<>()]"));
        ;
    }


}
