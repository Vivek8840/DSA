class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {
        Map<Integer,Set<Integer>> mp=new HashMap<>();

        for(int num[]:rs){
            mp.computeIfAbsent(num[0],k-> new HashSet<>()).add(num[1]);
        }
        int count=2*n;
        for(var keys:mp.entrySet()){
                Set<Integer> st=keys.getValue();
                boolean left=true;
                boolean right=true;
                boolean middle=true;
                for( var num:st){
                    if(num>=2 && num<=5)
                    left=false;
                    if(num>=6 && num<=9)
                    right=false;
                    if(num>=4 && num<=7)
                    middle=false;
                }
                if(left && right){

                }

               else if(left || right||middle)
                count--;

                else
                count-=2;
        }
        return count;
        
    }
}