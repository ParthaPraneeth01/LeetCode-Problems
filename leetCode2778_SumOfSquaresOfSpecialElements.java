class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int len=nums.length;
        for(int i=1;i<nums.length+1;i++){
            int num=nums[i-1];
            if(len%i==0){ 
                sum+=(num*num);
            }
        }
        return sum;
    }
}
