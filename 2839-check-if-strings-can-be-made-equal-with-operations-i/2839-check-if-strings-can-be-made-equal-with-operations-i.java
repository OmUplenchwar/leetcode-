class Solution {
    public boolean canBeEqual(String s1, String s2) {
        StringBuilder one=new StringBuilder();
        if(s1.equals(s2)) return true;
        one.append(s1.charAt(2));
        one.append(s1.charAt(3));
        one.append(s1.charAt(0));
        one.append(s1.charAt(1));
        if(s2.equals(one.toString())) return true;
        one.setCharAt(0,s1.charAt(0));
        one.setCharAt(2,s1.charAt(2));
        if(s2.equals(one.toString())) return true;
        one.setCharAt(0,s1.charAt(2));
        one.setCharAt(2,s1.charAt(0));
        one.setCharAt(1,s1.charAt(1));
        one.setCharAt(3,s1.charAt(3));
        if(s2.equals(one.toString())) return true;
        return false;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna