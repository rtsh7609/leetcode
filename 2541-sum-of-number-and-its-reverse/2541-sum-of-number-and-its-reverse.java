class Solution {
    public static boolean sumOfNumberAndReverse(int num) {
        
    	 for (int i = 0; i <= num; i++) {
             StringBuilder sb = new StringBuilder(String.valueOf(i));
        	
        	int rev =  Integer.parseInt(sb.reverse().toString());
        	
        	if(i + rev == num) {
        		return true;
        	}
		}
    	
    	return false;
    }
}