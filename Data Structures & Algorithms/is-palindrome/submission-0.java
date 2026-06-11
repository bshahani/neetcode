class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0)
            return true;
        
        StringBuffer sb = new StringBuffer();
        for (char c: s.toLowerCase().trim().toCharArray()) {
            if (Character.isLetterOrDigit(c))
                sb.append(String.valueOf(c));
        }
        String processedStr = sb.toString();
        int i = 0, j = processedStr.length() - 1;

        while (i < j && i != j) {

            if (processedStr.charAt(i) == processedStr.charAt(j)) {
                i++;
                j--;
            } else return false;
        }

        return true;
    }
}
