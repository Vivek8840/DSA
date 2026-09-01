class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0,r=0,maxlen=0;
        Map<Integer,Integer> hp=new HashMap<>();
        while(r<n){
            hp.put(fruits[r],hp.getOrDefault(fruits[r],0)+1);

            while(r>l && hp.size()>2){
            int freq=hp.get(fruits[l])-1;
            if(freq<=0){
                hp.remove(fruits[l]);
            }
            else
            hp.put(fruits[l],freq);
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}