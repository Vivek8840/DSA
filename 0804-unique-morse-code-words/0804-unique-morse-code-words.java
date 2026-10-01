class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String symbols[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();
        for(String s:words){
            StringBuilder sb=new StringBuilder();
            for(char c:s.toCharArray()){
                sb.append(symbols[c-'a']);
            }
            String temp=sb.toString();
            if(!set.contains(temp))
            set.add(temp);
        }
        return set.size();

    }
}