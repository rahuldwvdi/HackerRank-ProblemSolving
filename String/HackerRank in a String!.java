private static String checkIfIsHacker(String s) {
        String hack = "hackerrank";
        if (s.length() < hack.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < hack.length() && s.charAt(i) == hack.charAt(j)) {
                    j++;
            }
        }
        return (j == hack.length() ? "YES" : "NO");

    }
