class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)!=')'){
                stack.push(s.charAt(i));
                i++;
            }else{
                while(stack.peek()!='('){
                  sb.append(stack.pop());
                }
                stack.pop();
                // if(stack.size()==0) return sb.toString();
                for(int j=0;j<sb.length();j++){
                    stack.push(sb.charAt(j));
                }
                sb.setLength(0);
                i++;
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna