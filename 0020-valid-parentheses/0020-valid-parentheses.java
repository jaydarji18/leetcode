class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char currentChar : s.toCharArray()){
            if(currentChar == '{' || currentChar == '(' || currentChar == '['){
                stack.push(currentChar);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                if(currentChar == ')' && stack.peek() != '(') {
                    return false;
                }else if(currentChar == '}' && stack.peek() != '{') {
                    return false;
                }else if(currentChar == ']' && stack.peek() != '[') {
                    return false;
                }  

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}