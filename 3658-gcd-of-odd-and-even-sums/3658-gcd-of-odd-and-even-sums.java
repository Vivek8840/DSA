class Solution {
    public int gcd(int a,int b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumeven=0;
        int sumodd=0;
        int even=2;
        int odd=1;
        for(int i=1;i<=n;i++){
            sumeven+=even;
            even+=2;
            sumodd+=odd;
            odd+=2;
        }
        return gcd(sumeven,sumodd);
    }
}