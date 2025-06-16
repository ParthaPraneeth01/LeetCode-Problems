class Solution {
    static boolean isValid(char[][] arr,int row,int col,char k){
	    for(int r=0;r<9;r++){
	        if(arr[r][col]==k) return false;
	    }
	    for(int r=0;r<9;r++){
	        if(arr[row][r]==k) return false;
	    }
	    int r1=row-(row%3);
	    int c1=col-(col%3);
	    for(int i=r1;i<r1+3;i++){
	        for(int j=c1;j<c1+3;j++){
	            if(arr[i][j]==k) return false;
	        }
	    }
	    return true;
	}
	
	static boolean Solve(char[][] arr){
	    for(int i=0;i<9;i++){
	        for(int j=0;j<9;j++){
	            if(arr[i][j]=='.'){
	                for(char k='1';k<='9';k++){
	                    if(isValid(arr,i,j,k)){
	                        arr[i][j]=k;
	                        if(Solve(arr)){
	                            return true;   
	                        }
	                        arr[i][j]='.';
	                    }
	                }
	                return false;
	            }
	        }
	    }
	    return true;
	}
    public void solveSudoku(char[][] board) {
        Solve(board);
    }
}
