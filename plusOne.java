//一
class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        int i=len-1;
        int th=9;
        digits[i]+=1;
        while(i>0&&digits[i]>th){
            digits[i]=0;
            digits[--i]+=1;
        }
        if(i==0&&digits[i]>th){
            digits=new int[len+1];
            digits[0]=1;
        }
        return digits;
    }
}
//二
class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] result=new int[len+1];
        result[0]=1;
        return result;
    }
}
