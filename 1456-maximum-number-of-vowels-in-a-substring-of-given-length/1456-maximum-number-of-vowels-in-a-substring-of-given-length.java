class Solution {
    public int maxVowels(String s, int k) {

        int max = 0;
        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Count incoming vowel
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }

            // Remove outgoing vowel
            if(i >= k) {
                char left = s.charAt(i-k);

                if(left=='a' || left=='e' || left=='i' || left=='o' || left=='u') {
                    count--;
                }
            }

            // Update maximum
            if(i >= k-1) {
                max = Math.max(max, count);
            }
        }

        return max;
    }
}