var longestSubstring = function (s) {
    let maxLength = 0,
        start = 0,
        startOfWindow = 0,
        i = 0; // current character position

    let set = new Set();

    while (i < s.length) {
        if (set.has(s[i])) {
            set.delete(s[startOfWindow++]);
        } else {
            set.add(s[i++]);
            if (set.size > maxLength) {
                maxLength = set.size;
                start = startOfWindow;
            }
        }
    }

    return s.substr(start, maxLength);
};