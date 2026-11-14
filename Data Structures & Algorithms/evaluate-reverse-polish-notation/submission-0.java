class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i<tokens.length;i++){
            String val = tokens[i];
            if(val.equals("+")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b+a);
            }else if(val.equals("-")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b-a);
            }
            else if(val.equals("*")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b*a);
            }else if(val.equals("/")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b/a);
            }else{
                stk.push(Integer.valueOf(val));
            }
        }
        return stk.peek();
        
    }
}
