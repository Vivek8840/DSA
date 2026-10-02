class Solution {
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        String [] symbols={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<List<String>> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            int idx=digits.charAt(i)-'2';
            if(li.isEmpty()){
                for(char d:symbols[idx].toCharArray()){
                    List<String> temp=new ArrayList<>();
                    temp.add(String.valueOf(d));
                    li.add(temp);
                }

            }
            else{
                for(int k=0;k<li.size();k++){
                    List<String> lst=li.get(k);
                    List<String> store=new ArrayList<>();
                    for(String run:lst){
               for(char d:symbols[idx].toCharArray()){
                     store.add(run+d);

            }

                    }
                    li.set(k,store);

        }
            }
        }
        List<String> ans=new ArrayList<>();
        for(var eum:li){
            for(String sun:eum){
                ans.add(sun);
            }
        }
    

        return ans;
    }
    }