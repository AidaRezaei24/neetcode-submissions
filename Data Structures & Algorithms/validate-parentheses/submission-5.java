class Solution {
    public boolean isValid(String s) {
        if(((s.length())%2 )==0){
            ArrayList<Character> par=new ArrayList<Character>();
            for(int i=0; i<(s.length()) ; i++){
            if ((s.charAt(i)=='(') || (s.charAt(i)=='{') || (s.charAt(i)=='['))
            par.add(s.charAt(i));
            else if(par.isEmpty())
            return false;
            else if (((s.charAt(i)=='}')&&(par.get(par.size()-1)=='{' ))  || ((s.charAt(i)==']')&&(par.get(par.size()-1)=='[' )) || ((s.charAt(i)==')')&& (par.get(par.size()-1)=='(' )))
            par.remove(par.size()-1);
            else
            return false;    

            }
            if(par.isEmpty())
            return true;
            else
            return false;
        }
        else
        return false;
    }
}
