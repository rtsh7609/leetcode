class Solution {
    public int[] constructRectangle(int area) {
        int sq=(int)Math.sqrt(area);
        int [] array=new int [2];
        for(int i=sq;i>0;i--){
            if(area%i==0){
              array[1]=i;
              array[0]=area/i;
              break;
            }
        }
        return array;
    }
}