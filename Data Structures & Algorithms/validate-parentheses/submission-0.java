class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        Character c = s.charAt(0);
        if(c == '}' || c == ')' || c == ']' || s.length() == 1) 
            return false;

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++ ){
            Character ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if (stack.isEmpty()) return false;
                
                if((ch == ')' && stack.peek() =='(') ||
                (ch == '}' && stack.peek() == '{') ||
                (ch == ']' && stack.peek() == '[')){
                    stack.pop();
                }else{
                    return false;
                }
            }
               
            }

        
        return stack.isEmpty(); 
    }
}
