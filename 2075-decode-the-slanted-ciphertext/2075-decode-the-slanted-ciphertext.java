class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int store=encodedText.length()/rows;
       char[][] arr=new char[rows][store];
       for(int i=0;i<arr.length;i++){
        Arrays.fill(arr[i],' ');
       }
       int k=0;
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=encodedText.charAt(k);
            k++;
        }
       }
       StringBuilder sb=new StringBuilder();
       int i=0;
       int j=0;
       int mark=0;
       while(mark<arr[0].length){
             sb.append(arr[i][j]);
             if(j==arr[0].length-1 || i==arr.length-1){
                mark++;
                i=0;
                j=mark;
             }else{
                i++;
                j++;
             }
       }
       String s=sb.toString();
       return s.stripTrailing();


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna