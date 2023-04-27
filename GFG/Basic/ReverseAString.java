package GFG.Basic;
// https://practice.geeksforgeeks.org/problems/reverse-a-string/1?page=1&status[]=solved&sortBy=submissions

class Reverse {
    public static String reverseWord(String str) {
        char[] c = str.toCharArray();
        char[] c1 = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            c1[c.length - 1 - i] = c[i];
        }
        String s = "";
        for (Character ch : c1) {
            s += String.valueOf(ch);
        }
        return s;
    }
}