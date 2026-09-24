class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> stack= new ArrayDeque<>();
        for(int i=0 ; i<tokens.length;i++){
        if(tokens[i].equals("+")){
        int par1=stack.pop();
        int par2=stack.pop();
        int sum=par2+par1;
        stack.push(sum);}
        else if(tokens[i].equals("*")){
        int par1=stack.pop();
        int par2=stack.pop();
        int sum=par2*par1;
        stack.push(sum);}
        else if(tokens[i].equals("-")){
        int par1=stack.pop();
        int par2=stack.pop();
        int sum=par2-par1;
        stack.push(sum);}
        else if(tokens[i].equals("/")){
        int par1=stack.pop();
        int par2=stack.pop();
        int sum=par2/par1;
        stack.push(sum);}
        else
        stack.push(Integer.parseInt(tokens[i]));






        }
        return stack.peek();
    }
}
