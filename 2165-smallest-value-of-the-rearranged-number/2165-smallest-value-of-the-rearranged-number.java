class Solution{
    public long smallestNumber(long num){
        int[] arr=new int[10];
        long temp=num;
        num=Math.abs(num);
        while(num>0){
            arr[(int)(num%10)]++;
            num/=10;
        }
        long ans=0L;
        if(temp<0){
            int i=arr.length-1;
            while(i>0){
                if(arr[i]==0){
                    i--;
                }else{
                    ans=ans*10+i;
                    arr[i]--;
                }
            }
            ans=(long)(ans*Math.pow(10,arr[0]));
            ans*=-1;
        }else{
            int i=1;
            for(int j=1;j<arr.length;j++){
                if(arr[j]!=0){
                    ans=j;
                    arr[j]--;
                    break;
                }
            }
            ans=(long)(ans*Math.pow(10,arr[0]));
            while(i<arr.length){
                if(arr[i]==0){
                    i++;
                }else{
                    ans=ans*10+i;
                    arr[i]--;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna