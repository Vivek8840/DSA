class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key=String.valueOf(arr);
            mp.putIfAbsent(key,new ArrayList<>());
            mp.get(key).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}