class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] ch1 = new int[26];
        int[] ch2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            ch1[s1.charAt(i) - 'a']++;
            ch2[s2.charAt(i) - 'a']++;
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (ch1[i] == ch2[i]) {
                count++;
            }
        }

        int l = 0;

        for (int i = s1.length(); i < s2.length(); i++) {
            if (count == 26)
                return true;

            int ind = s2.charAt(i) - 'a';

            ch2[ind]++;

            if (ch1[ind] == ch2[ind]) {
                count++;
            } else if (ch1[ind] + 1 == ch2[ind]) {
                count--;
            }
            int ind2 = s2.charAt(l) - 'a';

            ch2[ind2]--;

            if (ch1[ind2] == ch2[ind2]) {
                count++;
            } else if (ch1[ind2] - 1 == ch2[ind2]) {
                count--;
            }
            l++;
        }
        return count == 26;
    }
}
