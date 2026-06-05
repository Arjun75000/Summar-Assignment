class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Assume first string is prefix
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix until it matches the start of current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
