class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        int [][] arr = new int[l1+1][l2+1];
        for(int i=l1-1;i>=0;i--){
            for(int j=l2-1;j>=0;j--){
                if(text1.charAt(i)==text2.charAt(j)){
                    arr[i][j]=1+arr[i+1][j+1];
                }
                else{
                    arr[i][j]=Math.max(arr[i][j+1],arr[i+1][j]);
                }
            }
        }
        return arr[0][0];
    }
}
