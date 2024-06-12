package hackerrank.algorithm.sequenceEquation;

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
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> result = new ArrayList<>(List.copyOf(p));

        Map<Integer, Integer> positionMap = new HashMap<>();

        for (int i = 0; i < p.size(); i++) {
            positionMap.put(p.get(i), i + 1);
        }

        for (int x = 1; x <= p.size(); x++) {
            int pos = positionMap.get(x);
            result.set(x - 1, positionMap.get(pos));
        }

        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> result = Result.permutationEquation(p);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();

        List<Integer> result = Result.permutationEquation(List.of(5, 2, 1, 3, 4));
        System.out.println(result);
    }
}
