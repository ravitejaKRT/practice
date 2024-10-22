package leetcode.grind75.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
// https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(()())";
        Solution sol = new Solution();
        System.out.println(sol.isValid(s));
        System.out.println(sol.isValid("(()())"));
    }
    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            Map<Character,Character> validCharacter = new HashMap<>();
            validCharacter.put('(',')');
            validCharacter.put('{','}');
            validCharacter.put('[',']');
            for(Character ch: s.toCharArray()){
                if(validCharacter.containsKey(ch)){
                    stack.push(ch);
                }else if(stack.isEmpty() || validCharacter.get(stack.pop())!=ch){
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }
}


