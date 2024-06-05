package hackerrank.algorithm.migratoryBirds;

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

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        List<Integer> birdsSight = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));

        for (Integer bird : arr) {
            if (bird >= 1 && bird <= 5) {
                birdsSight.set(bird - 1, birdsSight.get(bird - 1) + 1);
            }
        }

        int maxCount = birdsSight.get(0);
        int maxIndex = 0;

        for (int i = 1; i < birdsSight.size(); i++) {
            if (birdsSight.get(i) > maxCount) {
                maxCount = birdsSight.get(i);
                maxIndex = i;
            }
        }

        return maxIndex + 1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
