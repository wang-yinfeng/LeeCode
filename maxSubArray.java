//简单暴力，耗时较长
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=-9999;
        int a=0;
        if(nums.length==1){
            sum=nums[0];
        }else if(nums.length>1){
            for(int i=0;i<nums.length;i++){
                a=nums[i];
                if(sum<nums[i]){
                    sum=nums[i];
                }
                for(int j=i+1;j<nums.length;j++){
                    a+=nums[j];
                    if(sum<a){
                        sum=a;
                    }
                }
            }
        }
        return sum;
    }
}
//用时3ms，相对上一段代码快很多，但效果还是不明显
class Solution {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        if(len==0){
            return 0;
        }
        int[] dp=new int[len];
        dp[0]=nums[0];
        for(int i=1;i<len;i++){
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
        }
        int res=dp[0];
        for(int i=1;i<len;i++){
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
//用时1ms
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int sum=nums[0];
        int max=sum;
        for(int i=1;i<nums.length;i++){
            sum=(sum+nums[i])>nums[i]?(sum+nums[i]):nums[i];
            max=sum>max?sum:max;
        }
        return max;
    }
}
