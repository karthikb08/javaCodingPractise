public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabdef";
        int l = lengthOfLongestSubstringMethod(s);
        System.out.println("Lenght "+ l);
    }

    public static int lengthOfLongestSubstringMethod(String s) {

        int end=0;
        int start =0;

        int maxLen = Math.min(s.length(),1);

        java.util.Set<Character> seen = new java.util.HashSet<>();

        while(end < s.length()){
            char c = s.charAt(end);

            while(seen.contains(c)){
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(c);
            maxLen = Math.max(maxLen,seen.size());
            end++;
        }
        return maxLen;

    }
}
