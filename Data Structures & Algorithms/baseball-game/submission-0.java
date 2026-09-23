
class Solution {
   
    public int calPoints(String[] operations) {
       int out=0;
       ArrayList<Integer> scores = new ArrayList<>();
       for(int i=0; i<operations.length ; i++) {
       if(operations[i].equals("+"))     scores.add(scores.get(scores.size()-1)+scores.get(scores.size()-2));
       else if(operations[i].equals("C"))
       scores.remove(scores.size()-1);
       else if(operations[i].equals("D"))
       scores.add((scores.get(scores.size()-1))*2);
       else
       scores.add(Integer.parseInt(operations[i]));
       }
       for(int i=0; i<scores.size() ; i++)
       out=out+scores.get(i);

       return out;

    }
}