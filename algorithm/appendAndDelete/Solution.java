package hackerrank.algorithm.appendAndDelete;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * m = length of initial string
 * n = length of desire string
 * Time Complexity: 𝑂(min(m, n)
 * Space Complexity: 𝑂(1)
 */

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        if (k >= t.length() + s.length()) return "Yes";
        int same = Math.min(t.length(), s.length());
        char[] initialString = s.toCharArray();
        char[] desireString = t.toCharArray();

        for (int i = 0; i < same; i++) {
            if (initialString[i] != desireString[i]) {
                same = i;
                break;
            }
        }

        k -= (s.length() - same);
        k -= (t.length() - same);

        return (k >= 0 && k % 2 == 0) ? "Yes" : "No";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String t = bufferedReader.readLine();
//
//        int k = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String result = Result.appendAndDelete(s, t, k);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        System.out.println(Result.appendAndDelete("abc", "defg", 6));
    }
}
