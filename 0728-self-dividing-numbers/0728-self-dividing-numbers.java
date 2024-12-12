class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            if(check(i)){
                arr.add(i);
            }
        }
        return arr;
        
    }
    boolean check(int num)
    {
         int n=num;
        int count=0; 
        while(num>0)
        {
            int m=num%10;
            if(m==0)
            {
                return false;
            }
            if(n%m!=0)
            {
                return false;
            }
            num/=10;
        }
        return true;
    }
}