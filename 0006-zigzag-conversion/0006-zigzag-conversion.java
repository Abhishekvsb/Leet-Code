class Solution {

    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        String b[] = new String[numRows];

        for (int i = 0; i < b.length; i++) {
            b[i] = "";
        }

        int ind = 0;
        boolean g = false;

        for (char ch : s.toCharArray()) {

            b[ind] += ch;

            if (ind == 0 || ind == numRows - 1) {
                g = !g;
            }

            ind += g ? 1 : -1;
        }

        String c = "";

        for (String d : b) {
            c = c + d;
        }

        return c;
    }
}