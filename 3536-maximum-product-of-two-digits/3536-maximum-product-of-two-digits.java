class Solution {
    public int maxProduct(int n) {
        List<Integer> store=new ArrayList<>();
        while(n>0){
            store.add(n%10);
            n=n/10;
        }
        Collections.sort(store);
        return store.get(store.size()-1)*store.get(store.size()-2);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna