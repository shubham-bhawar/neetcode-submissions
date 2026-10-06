class Solution {
    public boolean checkValidString(String s) {
        // return check(s, 0, 0);

        int min = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                min += 1;
                max += 1;
            } else if (s.charAt(i) == ')') {
                min = min - 1;
                max = max - 1;
            } else {
                min = min - 1;
                max = max + 1;
            }
            if (min < 0)
                min = 0;
            if (max < 0)
                return false;
        }
        return min == 0;
    }
}

boolean check(String s, int i, int count) {
    if (count < 0)
        return false;
    if (i == s.length()) {
        return count == 0;
    }

    if (s.charAt(i) == '(') {
        return check(s, i + 1, count + 1);
    } else if (s.charAt(i) == ')') {
        return check(s, i + 1, count - 1);
    }
    return check(s, i + 1, count + 1) || check(s, i + 1, count) || check(s, i + 1, count - 1);
}

